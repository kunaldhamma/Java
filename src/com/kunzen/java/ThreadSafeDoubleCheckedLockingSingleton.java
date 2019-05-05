package com.kunzen.java;

public class ThreadSafeDoubleCheckedLockingSingleton {
	private static ThreadSafeDoubleCheckedLockingSingleton instance;
	
	public static  ThreadSafeDoubleCheckedLockingSingleton getInstance(){
		
		if(instance==null){
			synchronized(ThreadSafeDoubleCheckedLockingSingleton.class){
				if(instance==null){
					instance= new ThreadSafeDoubleCheckedLockingSingleton();
				}
			}
		}
			return instance;
	}

	private ThreadSafeDoubleCheckedLockingSingleton() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		ThreadSafeDoubleCheckedLockingSingleton sdp1 = getInstance();
		ThreadSafeDoubleCheckedLockingSingleton sdp2 = getInstance();
		System.out.println("sdp1:" + sdp1.hashCode());
		System.out.println("sdp2:" + sdp2.hashCode());
	}
	
}
