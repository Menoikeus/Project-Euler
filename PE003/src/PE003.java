import java.util.ArrayList;


public class PE003 {
    public static void main(String[] args)
    {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        
        long largest = 1L;
        long number = 600851475143L;
        for(long i = 2L; i <= number && number != 1; i++)
        {
        	System.out.println(i);
            if(number % i == 0)
            {
            	System.out.print("PF: " + i);
            	System.out.print("    " + number);
                largest = i;
                number = number/i;
                i--;
                System.out.println("    " + number);
            }
        }
        
        System.out.println(largest);
    }
}