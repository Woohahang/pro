package sec03.brd01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/board/*")
public class BoardController extends HttpServlet {

	BoardService boardService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		boardService = new BoardService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		String action = request.getPathInfo();
		System.out.println("action:" + action);

		String nextPage = "";

		if ((action.equals("/")) || action.equals("/listArticles.do")) {
			// action.equals 란, action 라는 변수 문자열과 equals의 괄호 안과 비교해 불림 값으로 반환
			// 그렇다면 action에는 뭐가 들어있냐? 주소가 들어있다.
			List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
			
			articlesList = boardService.listArticles();
			request.setAttribute("articlesList", articlesList);
			nextPage = "/board01/listArticles.jsp";
		} else {
			nextPage = "/board01/listArticles.jsp";
		}

		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
