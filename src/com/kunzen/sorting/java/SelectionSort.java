package com.kunzen.sorting.java;

/**
 * 
 * @author kunzen
 * Selection Sort Unstable version
 * Unstable means order of occurence of the same values in the array is not maintained after sorting.
 */
public class SelectionSort {
	static int [] a = {4,6,1,9,63,2,78,34};
  
	static int[] selectionSort(int [] a){
		
		int i,j,min_idx,temp;
		int n=a.length;
		
		for(i=0;i<n-1;i++){
			min_idx=i;
			
			for(j=i+1;j<n;j++){
				if(a[j]<a[min_idx]){
					min_idx=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min_idx];
			a[min_idx]=temp;
			
		}
		
		return a;
	}
	
	public static void main(String[] args) {
	  int [] sortRes = selectionSort(a);
	  System.out.println("Sorted Array=>");
	  for(int i:sortRes){
		  System.out.print(i+",");
	  }

	}
}
