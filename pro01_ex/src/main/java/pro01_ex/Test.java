package pro01_ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/NewFile")
public class Test extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("테스트");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dd");
		
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter();
	}

	@Override
	public void destroy() {
		System.out.println("11");
	}
}
