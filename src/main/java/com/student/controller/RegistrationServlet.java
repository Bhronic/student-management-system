package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter ps = response.getWriter();
		ps.println(" <html>"
				+ "<head>\r\n"
				+ "  <title>registration Page</title>\r\n"
				+ "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</head>"
				+ "<body>" 
				+ "<form method=\"post\" action=\"/student-management-system/save-student\" style=\"\r\n"
				+ "    margin-top: 10%; margin-right: 30%;\r\n"
				+ "    margin-left: 30%; >"
				+ "<div class=\"mb-3 mt-3\">\r\n"
				+ "      <label for=\"name\">Name:</label>\r\n"
				+ "      <input type=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Enter name\" name=\"name\">\r\n"
				+ "    </div>\r\n"
				
				+ "<div class=\"mb-3 mt-3\">\r\n"
				+ "      <label for=\"email\">Email:</label>\r\n"
				+ "      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\r\n"
				+ "    </div>\r\n"
				
				+ "    <div class=\"mb-3\">\r\n"
				+ "      <label for=\"pwd\">Password:</label>\r\n"
				+ "      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"password\">\r\n"
				+ "    </div>\r\n"
				+ "    <button type=\"submit\" class=\"btn btn-primary\">register</button>" 
				+ "<from>" 
				+ "</body></html>");
	}

}
