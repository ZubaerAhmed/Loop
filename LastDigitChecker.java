package Loop;

import java.util.Scanner;

public class LastDigitChecker {

	 public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter");
	    int num=sc.nextInt();
	        
	     System.out.println("Check");
	     int chk = sc.nextInt();
	     
	     boolean b = true;
	     while(num > 0){
	        int dig = num % 10;
	        if(dig == chk){
	          System.out.println("present");
	          b = false;
	        }
	        num = num / 10;
	     }
	     if(b == true){
	        System.out.println("Absent");
	     }
	        
	    }
}
//Enter
//3456
//Check
//4
//present