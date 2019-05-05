package com.kunzen.sorting.java;

/**
 * 
 * @author kunzen
 *
 */
public class MergeSort {
	  
	public static void main(String[] args) {
		 int [] a = {4,6,1,9,63,2,78,34};
		 int n =a.length;
	  mergeSort(a,0,n-1);
	  System.out.println("Sorted Array=>");
	  for(int i:a){
		  System.out.print(i+" ");
	  }

	}

/**
 * 
 * @param a
 * @param l
 * @param r
 *  Main function that sorts a[l..r] using 
 *   merge() 
 */
	private static void mergeSort(int[] a, int l, int r) {
		if(l<r){
			
			// Find the middle point 
			int m=(l+r)/2;
			
			// Sort first and second halves 
			mergeSort(a,l,m);
			mergeSort(a, m+1, r);
			
			// Merge the sorted halves 
			merge(a,l,m,r);
			
		}
		
	}
/**
 * 	Merges two sub-arrays of a[]. 
 *   First sub-array is a[l..m] 
 *  Second sub-array is a[m+1..r] 
 */
	private static void merge(int[] a, int l, int m, int r) {
		
		// Find sizes of two sub-arrays to be merged
		
			int n1=m-l+1;
			int n2=r-m;
			
		//Create temp arrays
			
			int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	        
	    //Copy data to temp arrays
	        for (int i=0; i<n1; i++) 
	            L[i] = a[l + i]; 
	        for (int j=0; j<n2; j++) 
	            R[j] = a[m + 1+ j];
	        
	    //merge the temp arrays
	        
	    //initial indexes of first and second sub-arrays
	        
	     int i=0,j=0;
	    
	    //initial index of merged sub-array
	     int k=l;
	     while(i<n1 && j<n2){
	    	 if(L[i]<=R[j]){
	    		 a[k]=L[i];
	    		 i++;
	    	 }
	    	 else{
	    		 a[k]=R[j];
	    		 j++;
	    	 }
	    	 k++;
	     }
	     
	     //copy remaining elements of L[] if any
	     while(i<n1){
	    	 a[k]=L[i];
	    	 i++;
	    	 k++;
	     }
		
	     //copy remaining elements of R[] if any
	     while(j<n2){
	    	 a[k]=R[j];
	    	 j++;
	    	 k++;
	     }
	}
}
