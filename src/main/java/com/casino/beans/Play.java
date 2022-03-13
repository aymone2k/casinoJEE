package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Play {
	private int miseUser;
private int nbTry;
private static int nbMystere= (new Random()).nextInt(22);	
	private int nbPlay;
	private int topBudget;
	private int lastBudget;
	private boolean playAgain;
	

	
/*public final int nbMyst(){
	nbMystere= (new Random()).nextInt(10);
	final int stock =nbMystere;
	return stock;
}*/


public void startPlay(HttpServletRequest request) {
	
	String mise = request.getParameter("mise");
	miseUser = Integer.parseInt(mise);
	topBudget = 1000;
	nbTry =5;
	
	//final int stock = nbMyst(); 
	System.out.println("--------1----------");
	//System.out.println(nbMyst());
	System.out.println(nbMystere);
	//System.out.println(stock);
	
	

	


	String numPlay =request.getParameter("nbPlay");
	
	nbPlay = Integer.parseInt(numPlay);
	
	if(nbPlay == nbMystere) {
		
		lastBudget = topBudget + (miseUser*2);
		playAgain = false;
		nbMystere= (new Random()).nextInt(22);	
	}else {
		
		lastBudget = topBudget - miseUser;
		playAgain= true;
		
		//retourne plus de tentavives poss
	}
	System.out.println("---------2---------");
	System.out.println(nbMystere);
	System.out.println(nbPlay);
	/*do {
		nbTry = nbTry -1;
		//lastBudget = topBudget -miseUser;
	
		// crédite mes gains ou mes pertes
		
	//	nbTry =nbTry -1;
		
	} while ((nbTry > 0 )&& (lastBudget>= miseUser));*/
		
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


public int getTopBudget() {
	return topBudget;
}


public void setTopBudget(int topBudget) {
	this.topBudget = topBudget;
}



}
