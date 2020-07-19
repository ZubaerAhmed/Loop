package Loop;

import java.util.Calendar;
import java.util.Scanner;

public class ValidAge {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your year of birth:");
	        // .hasNextInt(); is method for checking number
	        boolean hasNextInt = scanner.hasNextInt();

	        if(hasNextInt) {
	            int yearOfBirth = scanner.nextInt();
	         // handle next line character (enter key)
	            scanner.nextLine(); // handle next line character (enter key)

	            System.out.println("Enter your name: ");
	            String name = scanner.nextLine();
	            int todayYear = Calendar.getInstance().get(Calendar.YEAR);
	            //System.out.println(todayYear);
	            int age = todayYear - yearOfBirth;

	            if(age >= 0 && age <= 100) {
	                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
	            } else {
	                System.out.println("Invalid year of birth");
	            }
	        } else {
	            System.out.println("Unable to parse year of birth.");
	        }

	        scanner.close();
	    }
}
