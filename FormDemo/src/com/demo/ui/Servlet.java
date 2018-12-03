package com.demo.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dto.Model;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		 Model model=(Model) session.getAttribute("model");
		PrintWriter out=response.getWriter();
		
		out.println(" " +model);
		/*out.println("LastName : " +model.getLname());
		out.println("Address : " +model.getAddress());
		out.println("Gender : " +model.getGender());
		out.println("Language : " +model.getLang());
		out.println("City : " +model.getCity());
		out.println("EmailId : "+model.getEmail());*/
		
	}

}
