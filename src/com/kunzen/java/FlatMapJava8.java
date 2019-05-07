package com.kunzen.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapJava8 {
public static void main(String[] args) {
	List<String> lst1 = Arrays.asList("Amaresh", "Satya", "Babul", "Anku");
    List<String> lst2 = Arrays.asList("Kunal", "Renu", "Sukriti");
    List<String> lst3 = Arrays.asList("Nishu", "Rakesh", "Akhilesh");
    List<String> lst4 = Arrays.asList("Vidyanand", "Hemesh", "Puja");

    List<List<String>> finalList = new ArrayList<List<String>>(); 
    finalList.add(lst1);
    finalList.add(lst2);
    finalList.add(lst3);
    finalList.add(lst4);

    // Printing All final list In Pre-Java8 World
    List<String> listOfAllCombined = new ArrayList<String>();
    for(List<String> lst : finalList) {
        for(String name : lst) {
        	listOfAllCombined.add(name);
        }
    }

    System.out.println("<!---------------List of All befor Java 8---------------!>");
    System.out.println(listOfAllCombined);

    System.out.println();

    // Now let's Achieve This By Using 'flatMap()' Method In Java8 
    List<String> flatMapList = finalList.stream().flatMap(fList -> fList.stream()).collect(Collectors.toList()); 
    System.out.println("<!---------------List of All Using Java8---------------!>"); 
    System.out.println(flatMapList);  
}
}
