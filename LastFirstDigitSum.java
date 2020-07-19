package Loop;

import java.util.ArrayList;
import java.util.List;

public class LastFirstDigitSum {

	public static void main(String[] arg) {
		//System.out.println(sum(1234));
		sumList(1234);
		System.out.println("Sum is: " + sum(23456));
    }
//=================================
    public static int sumList(int number) {
    	if(number < 10) {
            return -1;
        }
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0) {
           int digit = number % 10;
           list.add(digit);
           number /= 10;   // same as number = number / 10;
        }       	
        sum = (int) list.get(0) + (int)list.get(list.size()-1);
    	System.out.println(sum);
		return sum;       
    }
//-----------------------------------------------------
    public static int sum(int number) {
    	  int firstdigit=0;
          int lastdigit=0;
          if(number>=0 && number<=9){
              return number + number; 
          }else if(number>9) {       	  
              lastdigit = number % 10; 
              while(number>0){               
                 // System.out.println(number);
                  if(number<=9 & number>=0){
                      firstdigit = number;
                  }
                  number/=10;
              }
             // System.out.println("firstdigit " + firstdigit);
             // System.out.println(lastdigit);
              return firstdigit+lastdigit;
          }else
          return -1;
    }
}
