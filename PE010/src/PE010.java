
public class PE010 {
	public static void main(String[] args)
	{
		long sum = 0;
		for(int i = 3; i < 2000000; i+=2)
		{
			boolean prime = true;
			for(int j = 2; j < i && prime == true; j++)
			{
				if(i % j == 0)
					prime = false;
			}
			if(prime)
			{
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("SUM: " + sum);
	}
}
