package com.ignite.app.students;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentCreationServlet
 */
@WebServlet("/createStudent")
public class StudentCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentCreationServlet() {
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
		String studentName = request.getParameter("sname");
		System.out.println("Std Name : "+studentName);
		
		String studentStandard = request.getParameter("sstd");
		System.out.println("Std Std : "+studentStandard);
		
		String studentContact = request.getParameter("scontact");
		System.out.println("Std Contact :"+studentContact);
		
		// connect with the database and store information
		Connection connect = DatabaseManagement.getConnection();
		try {
			PreparedStatement pStmt =  connect.prepareStatement("INSERT INTO public.students(s_id, s_name, s_standard, s_contact) VALUES (?, ?, ?, ?);");
			pStmt.setInt(1, (int)(Math.random() * 10000));
			pStmt.setString(2, studentName);
			pStmt.setString(3, studentStandard);
			pStmt.setString(4, studentContact);
			pStmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("view-students.jsp").forward(request, response);
		
	}

}
