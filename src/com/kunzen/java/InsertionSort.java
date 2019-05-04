package com.kunzen.java;

/**
 * 
 * @author kunzen
 *
 */
public class InsertionSort {
	static int [] a = {4,6,1,9,63,2,78,34};
	  
	static int[] insertionSort(int [] a){
		int i,j,k;
		int n=a.length;
		for(i=1;i<n;i++){
			k=a[i];
			j=i-1;
			while(j>=0 && a[j]> k){
				a[j+1]=a[j];
				j=j-1;
			}
			
			a[j+1]=k;
			
		}
		return a;
	}
	
	public static void main(String[] args) {
	  int [] sortRes = insertionSort(a);
	  System.out.println("Sorted Array=>");
	  for(int i:sortRes){
		  System.out.print(i+" ");
	  }

	}
}
