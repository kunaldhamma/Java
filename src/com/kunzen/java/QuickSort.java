package com.kunzen.java;

/**
 * 
 * @author kunzen
 *
 */
public class QuickSort {
	  
	static int partition(int [] a,int low ,int high){
		int pivot =a[high];
		int temp;
		int i=low-1;
		for(int j=low;j<high;j++){
			if(a[j]<=pivot){
				i++;
				 temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		 temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	
	static void quickSort(int [] a , int low ,int high){
		if(low<high){
			int pi=partition(a,low,high);
			quickSort(a,low,pi-1);
			quickSort(a, pi+1, high);
		}
		
	}
	
	public static void main(String[] args) {
		 int [] a = {4,6,1,9,63,2,78,34};
		 int n =a.length;
	  quickSort(a,0,n-1);
	  System.out.println("Sorted Array=>");
	  for(int i:a){
		  System.out.print(i+" ");
	  }

	}
}
