package sec05.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cfile")
public class ContextFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx = getServletContext();

		InputStream is = ctx.getResourceAsStream("/WEB-INF/file/init.txt"); // 경로에 있는 파일 자원 입력스트림을 반환

		// 파일 입출력시 버퍼리터라는 보조 스트림 이용
		BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
		String str = null;
		while ((str = buffer.readLine()) != null) {

			StringTokenizer token = new StringTokenizer(str, ",");
			System.out.println(token);
			String mmber = token.nextToken();
			System.out.println(mmber);
			String order = token.nextToken();
			System.out.println(order);
			String good = token.nextToken();
			System.out.println(good);
		}

	}

}
