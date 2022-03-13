package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;


public class Play {
	private int miseUser;
private static int nbMystere= (new Random()).nextInt(5);	
	private int nbPlay;
	private int topBudget;
	private int lastBudget;

	private boolean playAgain;
	private String message;
	



public void startPlay(HttpServletRequest request) {
	
	String mise = request.getParameter("mise");
	miseUser = Integer.parseInt(mise);
	String numPlay =request.getParameter("nbPlay");
	nbPlay = Integer.parseInt(numPlay);
	topBudget = 1000;
	lastBudget=topBudget;

	
	
		
			System.out.println("--------1----------");
			System.out.println(nbMystere);
			
			
			
			if(nbPlay == nbMystere) {
				
				lastBudget = topBudget + (miseUser*2);
				playAgain = false;
				nbMystere= (new Random()).nextInt(22);
				message = "bravo vous avez gagné!!";
			
			}else {
				
				lastBudget = topBudget - miseUser;
				playAgain= false;
				message = "perdu!";
			
			}
			System.out.println("---------2---------");	
			System.out.println(nbMystere);
			System.out.println(nbPlay);
			
		
	

}

public int getMiseUser() {
	return miseUser;
}

public void setMiseUser(int miseUser) {
	this.miseUser = miseUser;
}



public int getNbPlay() {
	return nbPlay;
}

public void setNbPlay(int nbPlay) {
	this.nbPlay = nbPlay;
}

public int getLastBudget() {
	return lastBudget;
}

public void setLastBudget(int lastBudget) {
	this.lastBudget = lastBudget;
}


public boolean isPlayAgain() {
	return playAgain;
}

public void setPlayAgain(boolean playAgain) {
	this.playAgain = playAgain;
}


public int getNbMystere() {
	
	return nbMystere;
}


public void setNbMystere(int nbMystere) {
	this.nbMystere = nbMystere;
}


public int getTopBudget() {
	return topBudget;
}


public void setTopBudget(int topBudget) {
	this.topBudget = topBudget;
}



public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}



}
