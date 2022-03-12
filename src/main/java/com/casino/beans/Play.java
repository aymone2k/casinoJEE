package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;

public class Play {
	private int miseUser;
	private int nbTry = 5;
	private int nbMystere;
	private int nbPlay;
	private int budget;
	private int lastBudget;
	private boolean playAgain;
 
public void startPlay(HttpServletRequest request) {
	String mise = request.getParameter("mise");
	miseUser = Integer.parseInt(mise);
	budget = 1000;
	budget = budget - miseUser;
	
	 nbMystere= (new Random()).nextInt(10);

	String numPlay =request.getParameter("nbPlay");
	
	nbPlay = Integer.parseInt(numPlay);
	
	
	
	do {
		  
		// cr�dite mes gains ou mes pertes
		if(nbPlay == nbMystere) {
			
			lastBudget = budget + (miseUser*2);
			playAgain = false;
		}else {
			
			lastBudget = budget - miseUser;
			playAgain= true;
			
			//retourne plus de tentavives poss
		}
		nbTry =nbTry -1;
		
	} while ((nbTry > 0 )&& (budget>= miseUser));
		
}
	

public int getMiseUser() {
	return miseUser;
}

public void setMiseUser(int miseUser) {
	this.miseUser = miseUser;
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

public int getBudget() {
	return budget;
}

public void setBudget(int budget) {
	this.budget = budget;
}

public boolean isPlayAgain() {
	return playAgain;
}

public void setPlayAgain(boolean playAgain) {
	this.playAgain = playAgain;
}



}
