package Loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PalindromeNumber {

	 public static void main(String[] args) {
			System.out.println(isPalindrome(-1221));
			System.out.println(isPalindrome(707));
			System.out.println(isPalindrome(11212));
			palindrome2(-1221);
			palindromeWord("Hello");
			palindromeString();
			palindromeArray();
			ArrayListObject();
		    }
//===================================================
	 public static boolean isPalindrome(int number) {
		 if (number < 0) {
		    number *= -1; //turn a negative number into a positive
		 }
		 int forwardNum = 0;
		 forwardNum += number;
		 int backwardNum = 0;
		 backwardNum += number%10;
		 number /=10;
		 while (number > 0) {
		      backwardNum *= 10;
		      backwardNum += number%10;
		      number /=10;
		 }
		 return forwardNum == backwardNum;
	}
//---------------------------------------------------
	 public static void palindrome2(int number) {
		 if (number < 0) {
			    number *= -1; //turn a negative number into a positive
			 }
		 int original = number;
		 int reverse = 0;

		 while(number > 0){
		      reverse = reverse * 10;
		      reverse = reverse + number%10;
		      number = number/10;  //condition
		      // int -> (Object)variable).getClass().getName()
		      // String -> variable.getClass().getName()
		    }
		 boolean bool = (original == reverse);		
		 System.out.println(bool +" " + reverse);
	 	}
//--------------------------------------------------
	 public static void palindromeWord(String word) {
		 String[] array = word.split("");
		 String[] array2 = new String[array.length];
		 for(int i=0; i<array.length; i++) {
			 array2[i] = array[array.length-i-1];
			 //System.out.println(array2[i]);
		 }		 
		 for(String s : array2) {
			 System.out.print(s); 
		 }
		 System.out.println();
	 }
//--------------------------------------------------
	 public static void palindromeString() {
		 String input = "Geeks for Geeks"; 		  
	     StringBuilder input1 = new StringBuilder(); 	  
	     // append a string into StringBuilder input1 
	     input1.append(input); 	  
	     // reverse StringBuilder input1 
	     input1 = input1.reverse(); 
	     System.out.println(input1); 
	 }
//----------------------------------------------------
	 public static void palindromeArray() {
		 String input = "GeeksForGeeks"; 		  
	     // convert String to character array 
	     char[] try1 = input.toCharArray(); 
	     for (int i = try1.length-1; i>=0; i--) { 
	         System.out.print(try1[i]); 
	     }
	     System.out.println();
	 }
//----------------------------------------------------
	 public static void ArrayListObject() {
		 String input = "Geeks For Geeks"; 
	        char[] hello = input.toCharArray(); 
	        List<Character> list = new ArrayList<>(); 
	  
	        for (char c: hello) 
	            list.add(c); 
	  
	        Collections.reverse(list); 
	        ListIterator<Character> li = list.listIterator(); 
	        while (li.hasNext()) 
	            System.out.print(li.next()); 
	        System.out.println();
	        //---with for loop-------------------
	        for(Character s : list) {
	        	System.out.print(s);
	        }
	        System.out.println();	
	 }
}

/*
true
true
false
true 1221
olleH
skeeG rof skeeG
skeeGroFskeeG
skeeG roF skeeG
skeeG roF skeeG
 */



