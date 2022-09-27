package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("");//.append(request.getContextPath());

		response.setContentType("text/html");
		PrintWriter ps = response.getWriter();
		ps.println(" <html>"
				+ "<head>\r\n"
				+ "  <title>Login page</title>\r\n"
				+ "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</head>"
				+ "<body>" 
				+ "<form method=\"post\" action=\"/student-management-system/welcome\" style=\"\r\n"
				+ "    margin-top: 10%; margin-right: 30%;\r\n"
				+ "    margin-left: 30%; >"
				+ "<div class=\"mb-3 mt-3\">\r\n"
				+ "      <label for=\"email\">Email:</label>\r\n"
				+ "      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"mb-3\">\r\n"
				+ "      <label for=\"pwd\">Password:</label>\r\n"
				+ "      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pswd\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"form-check mb-3\">\r\n"
				+ "      <label class=\"form-check-label\">\r\n"
				+ "        <input class=\"form-check-input\" type=\"checkbox\" name=\"remember\"> Remember me\r\n"
				+ "      </label>\r\n"
				+ "    </div>\r\n"
				+ "    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>" 
				+ "    <a href=\"register\">student register here!</a>" 
				+ "<from>" 
				+ "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
