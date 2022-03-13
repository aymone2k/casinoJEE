package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Play {
	private int miseUser;
private int nbTry;
private int nbMystere;	
	private int nbPlay;

	private int lastBudget;
	private boolean playAgain;
	

 
public void startPlay(HttpServletRequest request) {
	String mise = request.getParameter("mise");
	miseUser = Integer.parseInt(mise);

	 
	//budget = budget - miseUser;
	

	
lastBudget = lastBudget -miseUser;
	String numPlay =request.getParameter("nbPlay");
	
	nbPlay = Integer.parseInt(numPlay);
	
	
	
	//do {
		  
		// crédite mes gains ou mes pertes
	/*	if(nbPlay == nbMystere) {
			
			lastBudget = budget + (miseUser*2);
			playAgain = false;
		}else {
			
			lastBudget = budget - miseUser;
			playAgain= true;
			
			//retourne plus de tentavives poss
		}*/
	//	nbTry =nbTry -1;
		
	//} while ((nbTry > 0 )&& (budget>= miseUser));
		
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


public int getNbTry() {
	return nbTry;
}


public void setNbTry(int nbTry) {
	this.nbTry = nbTry;
}


public int getNbMystere() {
	return nbMystere;
}


public void setNbMystere(int nbMystere) {
	this.nbMystere = nbMystere;
}



}
