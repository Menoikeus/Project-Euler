
public class PE027 {
	public static void main(String[] args)
	{
		int highest = 0, highestProduct = 0;
		for(int a = -999; a < 1000; a++)
			for(int b = 0; b <= 1000; b++)
			{	
				if(isPrime(b))	
				{
					int primeCount = 0;
					boolean done = false;
					for(int i = 0; i < 500 && !done; i++)
					{
						int total = i * i + a * i + b;
						if(!isPrime(total) || total < 0)
							done = true;
						else
							primeCount++;
						//System.out.println(primeCount);
					}
					if(primeCount > highest)
					{
						highest = primeCount;
						highestProduct = a * b;
					}
				}
			}
		System.out.println("Highest prime count: " + highest + "\nHighest product: " + highestProduct);
				
	}
	
	public static boolean isPrime(int n)
	{
		boolean prime = true;
		for(int j = 2; j < n && prime == true; j++)
		{
			if(n % j == 0)
				prime = false;
		}
		return prime;
	}
}
