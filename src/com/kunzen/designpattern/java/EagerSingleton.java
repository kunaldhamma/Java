package com.kunzen.designpattern.java;
/**
 * 
 * @author kunzen
 *Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
 *The singleton class must provide a global access point to get the instance of the class.
 *Singleton pattern is used for logging, drivers objects, caching and thread pool.
 *Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 *Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
 *
 *
 */
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
