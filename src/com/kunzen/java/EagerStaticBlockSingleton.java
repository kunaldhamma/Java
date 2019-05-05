package com.kunzen.java;

public class EagerStaticBlockSingleton {
	private static EagerStaticBlockSingleton instance;
	
	public static EagerStaticBlockSingleton getInstance(){
		return instance;
	}

	private EagerStaticBlockSingleton() {
		super();
	}
	
	static {
		try{
			instance = new EagerStaticBlockSingleton();
		}
		catch(Exception ex){
			throw new RuntimeException("Exception occured in creating Singleton Instance");
		}
	}
	
	public static void main(String[] args) {
		EagerStaticBlockSingleton sdp1 = getInstance();
		EagerStaticBlockSingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
