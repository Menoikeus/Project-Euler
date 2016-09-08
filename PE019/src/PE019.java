
public class PE019 {
	public static void main(String[] args)
	{
		int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int total = 0;
		
		int offSet = 1;
		for(int z = 1900; z <=2000; z++)
		{
			int leap = 0;
			System.out.print("YEAR: " + z + "\t");
			
			if(z % 4 == 0 && (z % 100 != 0 || z % 400 == 0))
				leap = 1;
			
			int daysSoFar = (offSet-1);
			for(int i = 0; i < 12; i++)
			{
				if((daysSoFar+1)%7 == 0)
				{
					System.out.print(" " + (i+1) + " ");
					total++;
				}
				daysSoFar += daysInMonth[i] + (i == 1 ? leap : 0);
				System.out.print(daysSoFar + "/");
			}
			offSet += (daysSoFar - (offSet-1))% 7;

			System.out.println("D"+daysSoFar+"D"	);
			System.out.println("OFFSET: "+offSet	);
		}
		
		System.out.print("TOTAL: " + total);
	}
}
