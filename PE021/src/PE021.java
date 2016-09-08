import java.util.ArrayList;

public class PE021 {
	public static void main(String[] args)
	{
		ArrayList<Integer> amicableNums = new ArrayList<Integer>();
		for(int i = 1; i <= 10000; i++)
		{
			int sF = sumFac(i);
			if(sumFac(sF) == i && sF != i)
			{
				amicableNums.add(new Integer(i));
				amicableNums.add(new Integer(sF));
			}
		}
		
		int total = 0;
		for(Integer num : amicableNums)
		{
			System.out.println(num.intValue());
			total += num.intValue();
		}
		total /= 2;
		
		System.out.print("Total: " + total);
	}
	
	public static int sumFac(int n)
	{
		int sumFac = 0;
		for(int z = 1; z < n; z++)
			if(n % z == 0)
				sumFac += z;
		return sumFac;
	}
}
