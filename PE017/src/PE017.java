
public class PE017 {
	static String numbers[] = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	
	static String ten[] = new String[] { "zero", "ten", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	public static void main(String[] args)
	{
		String sum = "";
		for(int i = 1; i <= 999; i++)
		{
			int ones = i - i/10*10;
			//System.out.print(ones);
			int tens = i/10 - (i/10)/10*10;
			//System.out.print(tens);
			int hundreds = i/100 - (i/100)/10*10;
			
			if(hundreds != 0)
			{
				int temp = (tens*10+ones);
				sum += numbers[hundreds] + "hundred" + (ones == 0 && tens == 0 ? "" : "and" + (temp < 20 ? numbers[temp] : ((tens == 0 ? "" : ten[tens]) + ((ones == 0) ? "" : numbers[ones]))));
				
			}
			else if(tens !=0)
			{
				if(i < 20)
					sum += numbers[i];
				else
					sum += ten[tens] + ((ones == 0) ? "" : numbers[ones]);
			}
			else
			{
				sum += numbers[i];
			}
			//sum+="\n";
		}
		sum+="onethousand";
		
		System.out.print(sum.length());
	}
}
