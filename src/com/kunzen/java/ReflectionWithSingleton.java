package com.kunzen.java;

import java.lang.reflect.Constructor;

public class ReflectionWithSingleton {
public static void main(String[] args) {
	EagerSingleton instOne = EagerSingleton.getInstance();
	EagerSingleton instTwo=null;
	
	try{
		Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
		
		for(Constructor constr:constructors){
			constr.setAccessible(true);
			instTwo=(EagerSingleton)constr.newInstance();
			break;
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
		System.out.println(ex.getMessage());
	}
	
	System.out.println("instOne:"+instOne.hashCode());
	System.out.println("instTwo:"+instTwo.hashCode());
}
}
