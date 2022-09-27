package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveStudentServlet
 */
@WebServlet("/save-student")
public class SaveStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String emailId = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "admin@123");
			
			PreparedStatement ps1 = con.prepareStatement("INSERT INTO `user_info`.`student` (`emailid`, `name`, `password`) VALUES (?,?,?)");
			ps1.setString(1, emailId);
			ps1.setString(2, name);
			ps1.setString(3, password);
			int value = ps1.executeUpdate();
			System.out.println(value+" record is inserted.");
			
			if(value == 1) {
				PrintWriter ps = response.getWriter();
				ps.println(" <html>"
						+ "<head>\r\n"
						+ "  <title>welcome page</title>\r\n"
						+ "  <meta charset=\"utf-8\">\r\n"
						+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
						+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
						+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
						+ "</head>"
						+ "<body>" 
						+ "<form action=\"/action_page.php\" style=\"\r\n");
						
				ps.print("<div class=\"container-fluid p-5 bg-primary text-white text-center\">\r\n"
						+ "  <h1>Welcome to "+name+"</h1> <div>");
				
				ps.print("<b>User Details:</b><br>");
				ps.print("1. Name : "+name+"<br>");
				ps.print("2. Email id : "+emailId+"<br>");
						
						
				ps.print("<from></body></html>");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
