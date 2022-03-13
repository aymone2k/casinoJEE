package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;

public class User {
private boolean connect;
private String userName;
private int userAge;
private int nbTry;
private int topBudget;
private int nbMystere;

public void verifUser(HttpServletRequest request) {
	
	String name = request.getParameter("name");
	String ageUser = request.getParameter("age");
	int age = Integer.parseInt(ageUser);
	int limitAge = 18;
	int resultAge = Long.compare(age, limitAge);
	
	if(resultAge >= 0) {
		connect = true;
		userName=name;
		userAge=age;
		nbTry=5;
		topBudget=1000;
		nbMystere= (new Random()).nextInt(10);
	}
	else {
		connect=false;
		userName=name;
		userAge=age;
		nbTry=0;
		topBudget=0;
	}
	
}

public boolean isConnect() {
	return connect;
}

public void setConnect(boolean connect) {
	this.connect = connect;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public int getUserAge() {
	return userAge;
}

public void setUserAge(int userAge) {
	this.userAge = userAge;
}

public int getNbTry() {
	return nbTry;
}

public void setNbTry(int nbTry) {
	this.nbTry = nbTry;
}

public int getTopBudget() {
	return topBudget;
}

public void setTopBudget(int topBudget) {
	this.topBudget = topBudget;
}

public int getNbMystere() {
	return nbMystere;
}

public void setNbMystere(int nbMystere) {
	this.nbMystere = nbMystere;
}




}
