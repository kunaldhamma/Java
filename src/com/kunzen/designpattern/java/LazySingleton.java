package com.kunzen.designpattern.java;

public class LazySingleton {
	private static LazySingleton instance;
	
	public static LazySingleton getInstance(){
		
		if(instance==null){
			instance= new LazySingleton();
		}
			return instance;
	}

	private LazySingleton() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		LazySingleton sdp1 = getInstance();
		LazySingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
