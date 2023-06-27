package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/json2")
public class JsonServlet2 extends HttpServlet {

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
		PrintWriter writer =  response.getWriter();
		
		JSONObject jsonObj1 = new JSONObject();
		
		jsonObj1.put("name", "박지성");
		jsonObj1.put("age", "25");

		JSONObject jsonObj2 = new JSONObject();
		jsonObj2.put("name", "손흥민");
		jsonObj2.put("age", "30");

		JSONArray jsonArr =	new JSONArray();
		jsonArr.add(jsonObj1);
		jsonArr.add(jsonObj2);
		System.out.println(jsonArr.get(0) + "// 걍 테스트 해봄");
				
		JSONObject totalObject	= new JSONObject();
		totalObject.put("mamber", jsonArr);
		
		String jsonInfo = totalObject.toJSONString();
		System.out.println(jsonInfo);
		
		writer.print(jsonInfo); // 라이트 프린트를 써야 sjon6 의 data 에다 넣어줄 수 있다.
	}

}
