package com.casino.beans;

import jakarta.servlet.http.HttpServletRequest;

public class Play {
private int mise;
private int nbTry =5;
private int nbPlay;
private int nbMystere;
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
	User user = new User();
	int budget = user.getBudget();
	budget= budget - mise;
	
	lastBudget=budget;
	// faire une boucle pr nbTry = 
	
	//générateur du nbre mystere
}

}
