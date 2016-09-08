
public class PE012 {
	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;
		
		boolean done = false;
		while(!done)
		{
			count++;
			num += count;
			int nFactors = getNumFactors(num);
			done = getNumFactors(num) >= 500 ? true : false;
			System.out.println("NUM: " + num + "\t\t\tFactors: " + nFactors);
		}
		System.out.println(num);
	}
	public static int getNumFactors(int n)
	{
		int count = 1;
		for(int i = 2; i <= n; i++)
			if(n % i == 0)
				count++;
		return count;
	}
}
