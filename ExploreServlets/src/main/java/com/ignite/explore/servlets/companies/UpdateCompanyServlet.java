package com.ignite.explore.servlets.companies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateCompanyServlet
 */
public class UpdateCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companyId = request.getParameter("cid");
		int comId = Integer.parseInt(companyId);
		
		System.out.println("Company CEO to be updated : "+comId);
		Company companyToUpdate = DataManagement.getCompany(comId);
		
		request.setAttribute("comData", companyToUpdate);
		request.getRequestDispatcher("update-company.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int companyId = Integer.parseInt(request.getParameter("comId"));
		System.out.println("Company Id : "+companyId);
		
		String newCEO = request.getParameter("newCEOName");
		System.out.println("New CEO : " +newCEO);
		
		DataManagement.updateCompany(companyId, newCEO);
		request.getRequestDispatcher("company/view").forward(request, response);
	}

}
