package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;

public class Play {
private int mise;
private int nbTry =5;
private int nbPlay = 0;
private int nbMystere= (new Random()).nextInt(22);
private int lastBudget;

public int getLastBudget() {
	return lastBudget;
}
public void setLastBudget(int lastBudget) {
	this.lastBudget = lastBudget;
}
public int getMise() {
	return mise;
}
public void setMise(int mise) {
	this.mise = mise;
}
public int getNbTry() {
	return nbTry;
}
public void setNbTry(int nbTry) {
	this.nbTry = nbTry;
}
public int getNbPlay() {
	return nbPlay;
}
public void setNbPlay(int nbPlay) {
	this.nbPlay = nbPlay;
}
public int getNbMystere() {
	return nbMystere;
}
public void setNbMystere(int nbMystere) {
	this.nbMystere = nbMystere;
}

public void play(HttpServletRequest request) {
	
	//mise = Integer.parseInt(request.getParameter("mise"));
/*	User user = new User();
	int budget = user.getBudget();
	//budget= budget - mise;
	
	//lastBudget=budget;
	String numPlay =request.getParameter("nbPlay");
	
	nbPlay = Integer.parseInt(numPlay);

	
	if(nbPlay == nbMystere) {
		lastBudget = budget + mise;
	}else {
		lastBudget = budget -mise;
	};

	// faire une boucle pr nbTry = 
	
	//générateur du nbre mystere
	
	*/
}

}
