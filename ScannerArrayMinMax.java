package Loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ScannerArrayMinMax {

	public static void main(String args[]) {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter length of array:");
	      boolean hasInt = scan.hasNextInt();
	      
	      if(hasInt) {
	    	  int length = scan.nextInt();
		      int [] num = new int[length];
		      System.out.println("Enter " + length + " elements number");
		      for(int i=0; i<length; i++ ) {
		          num[i] = scan.nextInt();
		       }
		      //---------------------------------------------
		      //Calling Method Iterating technique
		      iterating(num);
	        //-------------------------------------------------------
		      Arrays.sort(num);
		      System.out.println("Sort-> Minimum = " + num[0]);
		      System.out.println("Sort-> Maximum = " + num[num.length-1]);
		      //---------------------------------------------
		      int min = Arrays.stream(num).min().getAsInt();
		      int max = Arrays.stream(num).max().getAsInt();
		      System.out.println("Array.stream-> Minimum : " + min); 
		      System.out.println("Array.stream-> Maximum : " + max); 
		      
		      //---------------------------------------------------------
		      Integer[] boxed = new Integer[num.length];
		      Arrays.setAll(boxed, i -> num[i]);
		      List<Integer> list = Arrays.asList(boxed);
		      System.out.println("Arrays.setAll-> Min: " + Collections.min(list) );
		      System.out.println("Arrays.setAll-> Max: " + Collections.max(list) );
		      //-----------------------------------------------
		   	  //Method 2
//		      Syntax:
//		    	  List<Integer> list=new ArrayList<Integer>();
//		    	  List<Integer> list=new LinkedList<Integer>();
//		    	  List<Integer> stack=new Stack<Integer>();
		      List<Integer> list1 = new ArrayList<Integer>();
		      //Collections.addAll(list1, num); 
		      for (int t : num) { 
		            list1.add(t); 
		        }
		      System.out.println("ArrayList add()-> Min Value: " + Collections.min(list1) );
		      System.out.println("ArrayList add()-> Max Value: " + Collections.max(list1) );
		
		      //----------------------------------------------
		      //RECURSION
		      //int arr[] = {54, 24, 4, 0, 2, 45, 55, 9, -7, 68};    
		      int maxRecur = maxUsingRecursion(num, num[0], 0);
		      int minRecur = minUsingRecursion(num, num[0], 0);
		      System.out.println("Recursion-> Maximum number = " + maxRecur + 
		    		  			"\nRecursion Minimum number = " + minRecur); 
		    //---------------------------------------------
		      //----------------------------------------------
		      Integer[] num23 = new Integer[length];
		      for(int i=0; i<length; i++ ) {
		          num23[i] = scan.nextInt();
		       }		      
		      List<Integer> list4 = new LinkedList<Integer>(Arrays.asList(num23));  
		      System.out.println("LinkedList-> Min Value: " + Collections.min(list4) );
		      System.out.println("LinkedList-> Max Value: " + Collections.max(list4) );
	      }
	      
	      scan.close();
	}     
//=============================================================	
	// recursion 
		private static int maxUsingRecursion(int[] arr, int num, int size){    
	        // base case
	        if(size == arr.length){
	            return arr[size-1];    
	        }
	        return Math.max(num, maxUsingRecursion(arr, arr[size], ++size));
	    }
	    
	    private static int minUsingRecursion(int[] arr, int num, int size){
	        // base case
	        if(size == arr.length)
	            return arr[size-1];
	        return Math.min(num, minUsingRecursion(arr, arr[size], ++size));
	    }
	//---------------------------------------------------------------
	public static void iterating(int[] num) {
	   // assign first array element to two variables
    int max4 = num[0];
    int min4 = num[0];
    // iterate and compare from array index 1
    for(int i = 1; i < num.length; i++){
        if(max4 < num[i]){
            max4 = num[i];
        }else if(min4 > num[i]){
            min4 = num[i];
       }                      
    }
    System.out.println("iterating()-> Maximum number = " + max4 + "\niterating()-> Minimum number = " + min4);        
	}
//-----------------------------------------------------
	 public int max(int [] array) {
	      int max = 0;	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i] < min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }      
//-------------------------------------------------------------	      
}
/*
Enter length of array:
2
Enter 2 elements number
34
35
iterating()-> Maximum number = 35
iterating()-> Minimum number = 34
Sort-> Minimum = 34
Sort-> Maximum = 35
Array.stream-> Minimum : 34
Array.stream-> Maximum : 35
Arrays.setAll-> Min: 34
Arrays.setAll-> Max: 35
ArrayList add()-> Min Value: 34
ArrayList add()-> Max Value: 35
Recursion-> Maximum number = 35
Recursion Minimum number = 34
56
57
LinkedList-> Min Value: 56
LinkedList-> Max Value: 57

*/