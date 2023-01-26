package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/exS02")
public class exS02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출");
	}
	
	public void destroy() {
		System.out.println("destroy 호출");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 호출");
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		// html 시작
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>서블릿 라이프 사이클 실습중</h1>");
		out.println("</body>");
		out.println("</html>");
		// html 끝
	}
}
