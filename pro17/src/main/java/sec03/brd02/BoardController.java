package sec03.brd02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	
	BoardService boardService;
	private static String ARTICLE_IMAGE_REPO = "C:\\board\\article_image";
	
	ArticleVO articleVO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		boardService = new BoardService();
		articleVO = new ArticleVO();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String action = request.getPathInfo();
		System.out.println("action:" + action);
		
		String nextPage = "";
		
		if( (action.equals("/"))  || action.equals("/listArticles.do")) {
			List<ArticleVO>  articlesList=new ArrayList<ArticleVO>();;
			articlesList=boardService.listArticles();
			request.setAttribute("articlesList", articlesList);
			nextPage = "/board02/listArticles.jsp";
		}else if(action.equals("/articleForm.do")) {
			nextPage = "/board02/articleForm.jsp";
		}else if(action.equals("/addArticle.do")) {
			
			
			Map<String, String> articleMap=upload(request,response );
			String title = articleMap.get("title");
			String content = articleMap.get("content");
			String imageFileName = articleMap.get("imageFileName");
			
			articleVO.setParentNO(0);
			articleVO.setId("hong");
			articleVO.setTitle(title);
			articleVO.setContent(content);
			articleVO.setImageFileName(imageFileName);
			
			boardService.addArticle(articleVO);
			nextPage = "/board/listArticles.do";
		
		}else {
			nextPage = "/board02/listArticles.jsp";
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
	

	
	public Map<String, String> upload(HttpServletRequest request, HttpServletResponse response){
		
		String encoding = "utf-8";
		
		
		// 새로운 글 쓰기에 대한 데이터를 여러 행태를 저장하지 좋은 키, 밸류의 맵 형태로 저장
		
		Map<String, String> articleMap = 	new HashMap<String, String>();
		
		// 파일 객체
		
		File currentDirPath =new File(ARTICLE_IMAGE_REPO);
		
		
		//파일 업로드 시 사용한 라이브러리(fileupload, common-io)
		// 업로드될 경로 
		
		
		// 파일을 올리는 공간에다가 파일을 올리고자하는 용량과 경로 설정
				// 파일 공간에 대한 설정을 위한 클래스 DiskFileItemFactory

				DiskFileItemFactory factory = new DiskFileItemFactory(); // 파일 설정과 관련된 여러가지 일을 하는 클래스, 파일과 관련된 내용을 항목(item) 형태로
																			// 저장함
																			// 파일 아이템이란 예를 들어, 파일이름, 파일 크기
				factory.setRepository(currentDirPath);

				// DiskFileItemFactory 클래스의 setSizeThreshold() 메서드는 메모리에 보관할 임시 파일의 크기 임계값을 설정하는
				// 데 사용됩니다. 이 메서드에서 사용되는 단위는 바이트(Byte)입니다.

				// setSizeThreshold() 메서드에 전달하는 매개변수는 바이트 단위로 지정되며,
				// 임시 파일의 크기가 이 임계값보다 크면 디스크에 파일이 저장됩니다. 임시 파일의 크기가 임계값보다 작으면 메모리에 보관됩니다.
				// 이렇게 함으로써 작은 파일은 메모리에 보관되어 더 빠른 처리가 가능하고, 큰 파일은 디스크에 저장되어 메모리 사용량을 줄일 수 있습니다.
				factory.setSizeThreshold(1024 * 1024); // 1024 byte * 1024 = 1KB

				// 파일을 올리는 행위를 하는 클래스

				ServletFileUpload upload = new ServletFileUpload(factory);
				System.out.println("파일 업로드 객체 : " + upload);
		
				// FileItem 은 인코딩 타입이 multipart/form-data 일 때 , POST로 요청시 받을 수 있는 항목 클래스
				
		
				
				try {
					
					List<FileItem> items = upload.parseRequest(request);
					
					for (int i = 0; i < items.size(); i++) {
						
						
						System.out.println("---------------------");
						FileItem fileItem = (FileItem) items.get(i);
						System.out.println(fileItem);
						System.out.println(fileItem.isFormField());
						// 폼필드 내용만 가져옴
						if(fileItem.isFormField()) {
							System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
							
							articleMap.put(fileItem.getFieldName(), fileItem.getString(encoding));
							
							
						}else {
							System.out.println("매개변수 이름 :" + fileItem.getFieldName());
							System.out.println("파일이름 :" + fileItem.getName());
							System.out.println("파일 크기" + fileItem.getSize() + "bytes");

							
							
							if (fileItem.getSize() > 0) {
								System.out.println(fileItem.getName());
								// 이전 버전의 익스플로러에서는 전체 경로를 가져오는 경우에 대비...중간에 혹시 폴더명이 끼여있는지 확인하는 코드
								int idx = fileItem.getName().lastIndexOf("\\");
								
								System.out.println("인덱스" + idx);
								
								if (idx == -1) {
									idx = fileItem.getName().lastIndexOf("/");    //익스플로러의 경우 대비
									System.out.println(idx);
								}
								
								String fileName = fileItem.getName().substring(idx + 1);
								
								//중간에 파일명에 //나 \가 포함될 경우 예외가 발생함, 예외가 발생하지 않도록 하는 코드 추가함
//								String fileName=fileItem.getName() + "\\hi" + "/nice";
								System.out.println("현재 경로" + currentDirPath);
								System.out.println("파일명" + fileName);
								
								articleMap.put(fileItem.getFieldName(), fileName);
								
								File uploadFile = new File(currentDirPath + "\\" + fileName);
								
								fileItem.write(uploadFile);
							}
							
							
							
						}
						
						
					}
					
					
				}catch(Exception e) {
					System.out.println("파일 업로드시 에러");
//					e.printStackTrace();
				}
				
				
				
				
				return articleMap;
				
	}
	
	
	
	
	
}
