import java.util.ArrayList;

public class PE014 {
	public static void main(String[] args)
	{
		int highest = 0;
		int highestProducer = 0;
		
		for(int i = 2; i < 1000000; i++)
		{
			int count = 1;
			long collatz = i;
			
			boolean failure = false;
			do
			{
				if(collatz % 2 == 0)
					collatz /= 2;
				else
					collatz = 3 * collatz + 1;
				count++;
			}while(collatz != 1 && !failure);
			System.out.println("NUMBER: " + i + "\t\tCOUNT: " + count);
			
			if(count > highest)
			{
				highest = count;
				highestProducer = i;
			}
		}
		System.out.println("HIGHEST CHAIN PRODUCER: " + highestProducer + "\tHIGHEST CHAIN COUNT: " + highest);
	}
}
