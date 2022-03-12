package com.casino.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.casino.beans.Play;

/**
 * Servlet implementation class CasinoGame
 */
public class CasinoGame extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CasinoGame() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/play.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Play play = new Play();
		play.play(request);
		
		
		request.setAttribute("lastBudget", play.getLastBudget());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/play.jsp").forward(request, response);
	}

}
