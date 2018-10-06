package com.kunzen.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

interface Lambdatest {
	public abstract void show();
}

interface LambdatestWithArg {
	public abstract void show(String str);
}

interface Addable {
	public abstract int add(int a, int b);
}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}

public class LambdaExp {

	public static void main(String[] args) {
		Lambdatest lbdTest=()->System.out.println("Hello Lambda");
		lbdTest.show();
		
		LambdatestWithArg lbdTestArg=str->System.out.println(str);
		lbdTestArg.show("Hello Lambda with Arg");
		
		Addable adb =(a,b)->a+b;
		System.out.println("Add result:"+adb.add(20, 30));
		
		 adb = (a,b)->{
			 int result=a+b;
			 System.out.println("Result:"+result);
			 return result;
		 };
		 adb.add(300, 400);
		 
		 List<String> forEachEx= new ArrayList<String>();
		 forEachEx.add("kunal");
		 forEachEx.add("Sukriti");
		 forEachEx.add("Amaresh");
		 forEachEx.add("karthick");
		 //forEach with lambda expression
		 forEachEx.forEach(n->System.out.println(n));
		 
		 //Thread example with lambda
		 
		 Thread t1 = new Thread(()->System.out.println("Thead is running"));
		 t1.start();
		 
		 //implementing comparable using lamda expression
		 
		 List<Product> list=new ArrayList<Product>();  
         
	        //Adding Products  
	        list.add(new Product(1,"Mac Book",50000));  
	        list.add(new Product(3,"Wireless Mouse",900));  
	        list.add(new Product(2,"UPS",2000));  
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
	        
	        
	      //filter and iterate collection data using lamdba expression
	        
	         list=new ArrayList<Product>();  
	        list.add(new Product(1,"Samsung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"Redmi4 ",26000f));  
	        list.add(new Product(6,"Lenevo Vibe",19000f));  
	          
	        // using lambda to filter data  
	        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
	          
	        // using lambda to iterate through collection  
	        filtered_data.forEach(  
	                product -> System.out.println(product.name+": "+product.price)  
	        );  
	  
		 
	        //Event Listener
	        
	        JTextField tf=new JTextField();  
	        tf.setBounds(50, 50,150,20);  
	        JButton b=new JButton("click");  
	        b.setBounds(80,100,70,30);  
	          
	        // lambda expression implementing here.  
	        b.addActionListener(e-> {tf.setText("hello swing");});  
	          
	        JFrame f=new JFrame();  
	        f.add(tf);f.add(b);  
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        f.setLayout(null);  
	        f.setSize(300, 200);  
	        f.setVisible(true);
	}
}
