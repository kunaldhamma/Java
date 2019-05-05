package com.kunzen.java;

public class EnumSingleton {
	private static EnumSingleton INSTANCE= new EnumSingleton();

	private EnumSingleton() {
		super();
	}
	
	public enum Singleton {
		INSTANCE
	}
	
	public static void main(String[] args) {
		Singleton sdp1 = Singleton.INSTANCE;
		Singleton sdp2 = Singleton.INSTANCE;
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
