package com.casino.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.casino.beans.Play;
import com.casino.beans.User;

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
		
		HttpSession session = request.getSession();
		User user =  (User) session.getAttribute("user");
		int topBudget = user.getTopBudget();
	int nbTry = user.getNbTry();
	int nbMystere = user.getNbMystere();
	Play play = new Play();
	play.setLastBudget(topBudget);
	play.setNbMystere(nbMystere);
	play.setNbTry(nbTry);
	
	request.setAttribute("play", play);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/play.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Play play = new Play();
		play.startPlay(request);
		request.setAttribute("play", play);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/play.jsp").forward(request, response);
	}

}
