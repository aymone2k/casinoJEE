package com.casino.beans;

import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;

public class User {
private boolean connect;
private String userName;
private int userAge;


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
		
		
	}
	else {
		connect=false;
		userName=name;
		userAge=age;
		
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



}
