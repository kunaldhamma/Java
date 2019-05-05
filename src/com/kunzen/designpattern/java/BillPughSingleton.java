package com.kunzen.designpattern.java;

public class BillPughSingleton {
	
	public static synchronized BillPughSingleton getInstance(){
		
		return BillPughSingletonHelper.INSTANCE;
	}

	private BillPughSingleton() {
		super();
	}
	
	private static class BillPughSingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static void main(String[] args) {
		BillPughSingleton sdp1 = getInstance();
		BillPughSingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
