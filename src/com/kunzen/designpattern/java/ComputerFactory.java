package com.kunzen.designpattern.java;
/**
 * 
 * @author Kunzen
 *java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 *valueOf() method in wrapper classes like Boolean, Integer etc.
 *
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
 
 public static void main(String[] args) {
	PC pc = (PC) ComputerFactory.getComputer("pc", "1gb", "1tb", "i5");
	System.out.println("PC:"+pc);
	
	Server server = (Server) ComputerFactory.getComputer("server", "1gb", "1tb", "i5");
	System.out.println("Server:"+server);
}
}
