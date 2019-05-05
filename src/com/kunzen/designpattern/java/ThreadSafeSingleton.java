package com.kunzen.designpattern.java;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	public static synchronized ThreadSafeSingleton getInstance(){
		
		if(instance==null){
			instance= new ThreadSafeSingleton();
		}
			return instance;
	}

	private ThreadSafeSingleton() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		ThreadSafeSingleton sdp1 = getInstance();
		ThreadSafeSingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
