package com.kunzen.java;

public class EagerSingleton {
	private static EagerSingleton instance= new EagerSingleton();
	
	public static EagerSingleton getInstance(){
		return instance;
	}

	private EagerSingleton() {
		super();
	}
	
	public static void main(String[] args) {
		EagerSingleton sdp1 = getInstance();
		EagerSingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
