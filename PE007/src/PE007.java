
public class PE007 {
	public static void main(String[] args)
	{
		int z = 0;
		int i = 2;
		while(z < 10001)
		{
			boolean prime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
					prime = false;
			}
			if(prime)
			{
				System.out.println(i);
				z++;
			}
			i++;
		}
	}
}
