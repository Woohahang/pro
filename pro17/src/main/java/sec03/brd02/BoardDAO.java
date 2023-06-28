package sec03.brd02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {

	private Connection conn;
	private DataSource dataFactory;
	private PreparedStatement pstmt;

	public BoardDAO() {
		// JNDI방식의 연결로 MemberDAO 객체를 초기화

		try {
			Context ctx = new InitialContext(); // 컨텍스트 작업을 위한 객체
			Context envContext = (Context) ctx.lookup("java:/comp/env"); // 오라클인지 mysql인지의 환경을 찾기위한 컨텍스트
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			System.out.println("톰캣의 context.xml에 정의되어 있는 이름부분에서 정확하지 않은 에러");
//					e.printStackTrace();
		}
	}

	public List<ArticleVO> selectAllArticles() {

		List<ArticleVO> articlesList = new ArrayList<ArticleVO>();

		try {
			conn = dataFactory.getConnection();

			String query = "select " + "level,articleno, parentno, title, content,  id, writedate" + " from t_board"
					+ " start with parentNO=0" + " CONNECT by prior articleno = parentno"
					+ " order siblings by articleno desc ";
			System.out.println(query);

			pstmt = conn.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int level = rs.getInt("level");
				int articleNO = rs.getInt("articleNO");
				int parentNO = rs.getInt("parentNO");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String id = rs.getString("id");
				Date writeDate = rs.getDate("writeDate");

				ArticleVO article = new ArticleVO();

				article.setLevel(level);
				article.setArticleNO(articleNO);
				article.setParentNO(parentNO);
				article.setTitle(title);
				article.setContent(content);
				article.setId(id);
				article.setWriteDate(writeDate);
				articlesList.add(article);

			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return articlesList;
	}

	
	
	public int getNewArticleNO() {
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT  max(articleNO) from t_board ";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			if(rs.next()) {
				return rs.getInt(1)+1;
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.println("글 추가시 새로운 다음 글번호 가져오다 에러남 ");
		}
		return 0;
	};
	
	public void insertNewArticle(ArticleVO article){
		
		try {
			conn = dataFactory.getConnection();
			int articleNO=getNewArticleNO();
			int parentNO = article.getParentNO();
			String title = article.getTitle();
			String content = article.getContent();
			String id = article.getId();
			String imageFileName = article.getImageFileName();
			
			
			String query = "INSERT INTO t_board (articleNO, parentNO, title, content, imageFileName, id)"
					+ " VALUES (?, ? ,?, ?, ?, ?)";
			
			System.out.println(query);
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, articleNO);
			pstmt.setInt(2, parentNO);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			pstmt.setString(5, imageFileName);
			pstmt.setString(6, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.println("새로운 글 추가시 에러");
		}
		
	}
	
	
	
	
}
