package Loop;

public class RecursionSplitNumber {

	public static void main(String[] args) {
		System.out.println("number " + 1024);
		
		System.out.println("whileLoop-----------");
		whileLoop(1024);

		System.out.println("\nreverse---------");
		reverse(1024);
		System.out.println("\nrecursion-----------");
		recursion(1024);
	}
//=============================================
	public static void whileLoop(int num) {
		while (num > 0) {
		    System.out.print( num % 10  + " ");
		    num = num / 10;
		}
	}
//-----------------------------------------
	public static void reverse(int num) {
		int reversenum = 0;
		while( num != 0 ){
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num % 10;         
	          num = num / 10;
	      }
		whileLoop(reversenum);	          
	}
//-----------------------------------------	
	 public static void recursion(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       } else {
	           System.out.print(number % 10  + " ");
	           //Method is calling itself: recursion
	           recursion(number/10);
	       }
	   }
	      
	
}
