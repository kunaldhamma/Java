package com.kunzen.designpattern.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Kunzen
 * prototype design pattern is used when object creation is a costly affair and there is a similar object already available 
 * prototype design pattern should provide a mechanism to copy the original object and modify it , java provides cloning for the same
 */
public class PrototypePattern implements Cloneable {

	 private List<String> employeeList ;

	public PrototypePattern(List<String> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public PrototypePattern() {
		super();
		employeeList= new ArrayList<String>();
	}
	
	public void loadData(){
		employeeList.add("Kun");
		employeeList.add("Dhiraj");
		employeeList.add("Karthick");
		employeeList.add("Amaresh");
	}
	
	public List<String> getEmployeeList(){
		return employeeList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String str:this.employeeList){
			temp.add(str);
		}
		return temp;
		
	}
	 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypePattern prototypePattern = new PrototypePattern();
		prototypePattern.loadData();
		List<String> empLst1 = (List<String>) prototypePattern.clone();
		empLst1.add("Added");
		
		List<String> empLst2 = (List<String>) prototypePattern.clone();
		empLst2.remove("Kun");
		
		System.out.println("employeeList:"+prototypePattern.getEmployeeList());
		System.out.println("empLst1:"+empLst1);
		System.out.println("empLst2:"+empLst2);
		
	}
}
