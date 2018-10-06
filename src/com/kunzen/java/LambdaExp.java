package com.kunzen.java;

interface Lambdatest {
	public abstract void show();
}

interface LambdatestWithArg {
	public abstract void show(String str);
}
public class LambdaExp {

	public static void main(String[] args) {
		Lambdatest lbdTest=()->System.out.println("Hello Lambda");
		lbdTest.show();
		
		LambdatestWithArg lbdTestArg=str->System.out.println(str);
		lbdTestArg.show("Hello Lambda with Arg");
	}
}
