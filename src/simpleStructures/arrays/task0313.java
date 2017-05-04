package simpleStructures.arrays;

public class task0313 {

//	package com.javarush.task.task03.task0313;

	/* 
	Мама мыла раму
	*/
	
	static String[] txt = {"Мама", "Мыла", "Раму", "Мылом"};
	
	//public class Solution {
	    public static void main(String[] args) {
	        
	        int[] indexArray = new int[txt.length];
	        
	        for (int i=0; i< txt.length; i++) 
	        	indexArray[i] = i;
	        
	        boolean ableToContinue = true;
	        
	        int count = 0;
	        do {
	        	count += 1;
	        	printArray(indexArray);
	        	ableToContinue = getNextCombination(indexArray);
	        }	
	        while (ableToContinue); 
	        
	        System.out.println();
	        System.out.println("Total "+count+" combinations");
	    }
	    
	    private static boolean getNextCombination(int[] X) {
	    	
	    	final int N = txt.length;
	        final int maxIndex = N-1;
	        
        	int i = maxIndex-1;
        	
        	// поиск i 
        	while (i >= 0 && (X[i] > X[i+1])) 
        		i--;
        		
        	if (i>=0) {
        		
        		int j = i+1;
        		
        		// Поиск j
        		while (j<maxIndex && X[j+1]>X[i])
        			j++;
        		
        		swapElements(X, i, j);
        		
        		int mod = (Integer)((maxIndex+i) / 2);
        		// упорядочить остальные элементы по убыванию
        		for (int k=i+1; k<=mod; k++) {
        			swapElements(X, k, maxIndex-k+i+1);
        		}
        		return true;
        	}
        	else
        		return false;
	        	
	    }
	    
	    private static void swapElements(int[] arr, int firstEl, int secondEl) {
	    	int tmp = arr[firstEl];
	    	arr[firstEl] = arr[secondEl];
	    	arr[secondEl] = tmp;
	    }
	    
	    private static void printArray(int[] arr) {
	        int size = arr.length;
	        for (int i=0; i<size; i++) {
	        	System.out.print(txt[arr[i]]);
	        }
	        System.out.println();
//	        for (int i=0; i<size; i++) {
//	        	System.out.print(arr[i]+" ");
//	        }
//	        System.out.println();
	    }
	//}

}
