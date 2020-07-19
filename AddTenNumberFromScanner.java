package Loop;

import java.util.Scanner;

public class AddTenNumberFromScanner {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        int counter = 0;
	        int sum = 0;
	        int sum2 = 0;
	      

//	        while(true) {
	        while(counter < 2) {
	            int order = counter + 1;
	            System.out.println("Enter number #" + order + ":");
	            boolean isAnInt = scanner.hasNextInt();
	            if(isAnInt) {
	               int number = scanner.nextInt();
	               counter++;
	               sum += number;
//	               if(counter == 10) {
//	                   break;
//	               }
	            } else {
	                System.out.println("Invalid number");
	            }

	           // scanner.nextLine(); // handle end of line (enter key)
	        }
	        System.out.println("sum = " + sum);
//------------------------------------------------------------------
            for(int i=1; i<4; i++) {
            	System.out.println("Enter number ##" + i + ":");
            	boolean isAnInt2 = scanner.hasNextInt();
 	            if(isAnInt2) {
 	               int number = scanner.nextInt();
 	               sum2 += number;
 	              
 	            }else {
                System.out.println("Invalid number");
 	            }
 	          // scanner.nextLine(); // handle end of line (enter key)   
            }
    
	        System.out.println("sum = " + sum2);
	        scanner.close();
	    }
}
/*
Enter number #1:
1
Enter number #2:
2
Enter number ##1:
3
Enter number ##2:
4
Enter number ##3:
5
sum = 3
sum2 = 12
*/