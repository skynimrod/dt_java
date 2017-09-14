package com.AquGen.eztalk.controller;

import java.io.*;

public class FirstJavaBean {

private String FirstProperty = new String("");

public FirstJavaBean() {

}

public String getFirstProperty() {

return FirstProperty;

}

public void setFirstProperty(String value) {

FirstProperty = value;

}

public String returnIpString(){
	if ( FirstProperty.equals("127.0.0.1"))
		//return( "http://www.sina.com.cn");
		return("test2.html");
	else
		return("http://www.channelsoft.com");
}

public static void main(String[] args) 

{

	System.out.println("My First JavaBean!");

}

}

