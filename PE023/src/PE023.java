import java.util.ArrayList;

public class PE023 {
	public static void main(String[] args)
	{
		boolean[] unsummableNumbers = new boolean[28124];
		for(int i = 0; i < 28123; i++)
			unsummableNumbers[i] = true;
		
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
		for(int i = 0; i < 28123; i++)
			if(isAbundant(i))
			{
				abundantNumbers.add(new Integer(i));
				//System.out.println(i);
			}
		
		for(int i = 0; i < abundantNumbers.size(); i++)
			for(int z = i; z < abundantNumbers.size(); z++)
			{
				int sum = abundantNumbers.get(i).intValue() + abundantNumbers.get(z).intValue();
				if(sum < 28123)
					unsummableNumbers[sum] = false;
			}
		
		int sum = 0;
		for(int i = 0; i < unsummableNumbers.length; i++)
			if(unsummableNumbers[i])
				sum+= i;
		System.out.println(sum);
				 
				 
	}
	
	public static boolean isAbundant(int n)
	{
		int sumFac = 0;
		for(int i = 1; i < n; i++)
			if(n % i == 0)
				sumFac += i;
		
		if(sumFac > n)
			return true;
		else
			return false;
	}
}
