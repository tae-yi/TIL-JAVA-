package ch08;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch08/CalcServlet")
public class CalcServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		try {
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			String op = request.getParameter("op");
			int result = 0;

			try {
				switch (op) {
				case "+":
					result = n1 + n2;
					break;
				case "-":
					result = n1 - n2;
					break;
				case "/":
					result = n1 / n2;
					break;
				case "*":
					result = n1 * n2;
					break;
				}
				
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>서블릿 계산기</h1>");
				out.println("<hr/>");
	            out.println("계산결과 : " + n1 + op + n2 + "=" + result);
				out.println("</body>");
				out.println("</html>");
			} catch (Exception e) {
				out.println("<h2>나눗셈에러! 0으로 나눌수 없습니다!</h2>");
			}
		} catch (Exception a) {
		    out.println("<h2>숫자입력에러! 숫자는 정수만 입력하세요!</h2>");
		}
	}
}

