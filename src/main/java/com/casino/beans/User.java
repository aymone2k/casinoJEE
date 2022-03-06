package com.casino.beans;

import jakarta.servlet.http.HttpServletRequest;

public class User {
private String name;
private int age;
private int budget =1000 ;
private boolean login;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getBudget() {
	return budget;
}
public void setBudget(int budget) {
	this.budget = budget;
}
public boolean isLogin() {
	return login;
}
public void setLogin(boolean login) {
	this.login = login;
}


public void isMajeur(HttpServletRequest request) {
	
	name = request.getParameter("name");
	age = Integer.parseInt(request.getParameter("age"));
	int limitAge = 18;
	
	int resultAge = Long.compare(age, limitAge);
	if(resultAge >= 0) {
		login = true;
		
	}
	else {
		login=false;
	}
}

}
