package ch18;

import java.io.IOException;
import java.util.stream.IntStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controllerServlet")
public class controllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("range",IntStream.range(1,  11).toArray());
		request.setAttribute("sum",IntStream.rangeClosed(1,  10).sum());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/template.jsp");
		dispatcher.forward(request, response);
	}

}
