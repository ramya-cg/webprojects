package com.demo.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dto.Model;

/**
 * Servlet implementation class HtmlForm
 */
@WebServlet("/HtmlForm")
public class HtmlForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String add = request.getParameter("address");
		String gender = request.getParameter("gender");
		String lang = request.getParameter("lang");
		String city=request.getParameter("city");
		String email=request.getParameter("emailid");

		HttpSession session = request.getSession();
		
		Model model = new Model();

		model.setFname(fname);
		model.setLang(lang);
		model.setLname(lname);
		model.setGender(gender);
		model.setAddress(add);
		model.setCity(city);
		model.setEmail(email);

		session.setAttribute("model", model);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/Servlet2");
		dispatcher.forward(request, response);

	}

}
