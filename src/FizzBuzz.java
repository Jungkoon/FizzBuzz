
public class FizzBuzz {

	public static void main(String[] args) {
	    for (int num = 1; num <= 100; num++) {
	        if (0 == num % 3 && 0 == num % 5) {
	        	System.out.println("FizzBuzz");
	        } else if (0 == num % 3) {
	    		System.out.println("Fizz");
	    	} else if (0 == num % 5) {
	    		System.out.println("Buzz");
	    	} else {
	    	System.out.println( num );	    
	        }
	        }
	}
}
	