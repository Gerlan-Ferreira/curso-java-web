package br.com.curso.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.curso.dao.UsuarioDaoImpl;
import br.com.curso.model.Usuario;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/logoutController")
public class LogoutController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("ateLogo", "Obrigado, até logo!");
		rd.forward(request, response);
	}

}
