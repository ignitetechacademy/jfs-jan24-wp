package com.ignite.explore.servlets.companies;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCompanyServlet
 */
public class CreateCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET - Company Creation Servlet called ....");
		
		Integer companyId = Integer.valueOf(request.getParameter("com_id"));
		System.out.println("Company Id : "+companyId);
		
		String companyName = request.getParameter("com_name");
		System.out.println("Company Name : "+companyName);
		
		String ceoName = request.getParameter("ceo_name");
		System.out.println("CEO Name : "+ceoName);
		
		Company com = new Company(companyId, companyName, ceoName);
		DataManagement.createCompany(com);
		
		request.getRequestDispatcher("view").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
