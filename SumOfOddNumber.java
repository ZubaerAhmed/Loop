package Loop;

public class SumOfOddNumber {

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
		System.out.println("-----------------------");
		sumOdd2(1, 100);
	    }
//=================================================
	    public static boolean isOdd(int number) {
	        if(number < 0){
	            return false;
	        }else if (number % 2 == 0) {
	            return false;
	        }else{
	            return true;
	        }
	    }
//-------------------------------------------------
	    public static int sumOdd(int start, int end){
	        if (start > end || start < 0 || end < 0) {
	            return -1;
	        }else{
	            boolean numTest = false;
	            int oddSum = 0;
	            for (int n=start; n<end; n++) {
	                numTest = isOdd(n);
	                if (numTest) {
	                    oddSum += n;
	                }
	            }
	            return oddSum;
	        }
	    }
//----------------------------------------------------
	    public static void sumOdd2(int start, int end) {  	
	    	int oddSum = 0;
	    	while(start <= end) {   	
	    		if(isOdd(start)) {
	    			//System.out.println(start);
	    			oddSum += start;
	    	    
	    		}
	    		start++;
	    		continue;
	    	}
	    	System.out.println(oddSum);
	    }
	    
	        
}
