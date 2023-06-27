package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@WebServlet("/json")
public class JsonServlet1 extends HttpServlet {

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

		String jsonInfo = request.getParameter("jsonInfo");
		System.out.println(jsonInfo);

//		try {
//			JSONParser jSonparser = new JSONParser();
//			JSONObject jsonObj = (JSONObject)jSonparser.parse(jsonInfo);
//			System.out.println(jsonObj);
//			System.out.println(jsonObj.get("name"));
//			System.out.println(jsonObj.get("age"));
//			System.out.println(jsonObj.get("gender"));
//			System.out.println(jsonObj.get("nickname"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

		try {
			JSONObject jsonObj = (JSONObject) new JSONParser().parse(jsonInfo);
			System.out.println(jsonObj);
			System.out.println(jsonObj.get("name"));
			System.out.println(jsonObj.get("age"));
			System.out.println(jsonObj.get("gender"));
			System.out.println(jsonObj.get("nickname"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
