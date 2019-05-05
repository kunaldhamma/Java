package com.kunzen.designpattern.java;
/**
 * 
 * @author Kunzen
 *java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 *valueOf() method in wrapper classes like Boolean, Integer etc.
 *Many frameworks like ,spring,boot ,hibernate uses factory pattern
 */
public class ComputerFactory {
 public static Computer getComputer(String type, String ram, String hdd,String cpu){
	 if(type.equalsIgnoreCase("PC")){
		 return new PC(ram,hdd,cpu);
	 }
	 else if(type.equalsIgnoreCase("Server")){
		 return new Server(ram,hdd,cpu);
	 }
	 return null;
 }
 
 public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
	return computerAbstractFactory.createComputer();
 }
 
 public static void main(String[] args) {
	 
	 // for factory pattern
	PC pc = (PC) ComputerFactory.getComputer("pc", "1gb", "1tb", "i5");
	System.out.println("PC:"+pc);
	Server server = (Server) ComputerFactory.getComputer("server", "1gb", "1tb", "i5");
	System.out.println("Server:"+server);
	
	//for abstract factory pattern
	 pc = (PC) ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "I7"));
	 System.out.println("PC:"+pc);
	 server = (Server) ComputerFactory.getComputer(new ServerFactory("16GB", "2TB", "I9"));
	 System.out.println("Server:"+server);
	
}
}
