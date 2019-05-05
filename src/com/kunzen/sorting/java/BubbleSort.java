package com.kunzen.sorting.java;

public class BubbleSort {
	static int [] a = {4,6,1,9,63,2,78,34};
  
	static int[] bubbleSort(int [] a){
		
		int i,j,temp;
		int l = a.length;
		for(i=0;i<l;i++){
			boolean swap=false;
			for(j=0;j<l-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				swap=true;
			}
			if(swap==false)
				break;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
	  int [] sortRes = bubbleSort(a);
	  System.out.println("Sorted Arra=>");
	  for(int i:sortRes){
		  System.out.print(i+",");
	  }

	}
}
