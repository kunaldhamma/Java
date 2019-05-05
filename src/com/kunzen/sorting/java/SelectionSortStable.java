package com.kunzen.sorting.java;

/**
 * 
 * @author kunzen
 * Stable selection sort. In this sort swiping is avoided so that the order of the elements having same values are maintained after the sort.
 *
 */
public class SelectionSortStable {
	static int [] a = {4,6,1,9,63,2,78,34};
	  
	static int[] selectionSortStable(int [] a){
		
		int i,j,min_idx,key;
		int n=a.length;
		
		for(i=0;i<n-1;i++){
			min_idx=i;
			
			for(j=i+1;j<n;j++){
				if(a[j]<a[min_idx]){
					min_idx=j;
				}
			}
			
		 key =a[min_idx];
		 
		 while(min_idx>i){
			 a[min_idx]=a[min_idx-1];
			 min_idx--;
		 }
		
		 a[i]=key;
			
		}
		
		return a;
	}
	
	public static void main(String[] args) {
	  int [] sortRes = selectionSortStable(a);
	  System.out.println("Sorted Array=>");
	  for(int i:sortRes){
		  System.out.print(i+",");
	  }

	}
}
