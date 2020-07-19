package Loop;

import java.util.ArrayList;
import java.util.List;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

		System.out.println(getEvenDigitSum2(123456789));
		System.out.println(getEvenDigitSum2(252));
		System.out.println(getEvenDigitSum2(-22));
	}
//=================================================
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
 
        int finalNumber = 0;
        while (number > 0) { //loop ends when all the numbers have been tested
            if (((number%10)%2) == 0) { //test for the last digit is even
                finalNumber += number%10; //takes out the last digit
            }
            number /= 10; //takes out last digit to test the next digit
        }
        return finalNumber;    
    }
 //----------------------------------------------
  //=================================================
    public static int getEvenDigitSum2(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        List<Integer> list = evenList(number);
//      System.out.println((Object)list.get(1).getClass().getName());
        for(int i=0; i<list.size(); i++) {
             if((list.get(i) % 2) == 0){
            	sum = sum + list.get(i);
            }
        }
        return sum;
    }
 //----------------------------------------------
    public static List<Integer> evenList(int num) {
    	List<Integer> list = new ArrayList<Integer>();
		while (num > 0) {
			int b =  num % 10;
		   // System.out.println(b);
		    list.add(b);
		    num = num / 10;
		}
		return list;
    }
}
