
public class PE004 {
	public static void main(String[] args)
	{		
		long highest = 0;
		for(int i = 999; i > 100; i--)
		{
			boolean breakPoint = false;
			for(int j = 999; j > 100 && breakPoint == false; j--)
				if(isPalindrome(i * j))
				{
					breakPoint = true;
					if(i * j > highest)
						highest = i * j;
				}
			breakPoint = true;
		}
		System.out.print("HIGHEST = " + highest);
	}
	
	public static boolean isPalindrome(long number)
	{
		boolean isPalindrome = true;
		String convertedNumber = Long.toString(number);
		
		for(int i = 0; i < convertedNumber.length()/2 && isPalindrome == true; i++)
		{
			System.out.println(convertedNumber.substring(i,i+1) + " " + convertedNumber.substring(convertedNumber.length() - i - 1, convertedNumber.length() - i));
			if(!convertedNumber.substring(i,i+1).equals(convertedNumber.substring(convertedNumber.length() - i - 1, convertedNumber.length() - i)))
				isPalindrome = false;
		}
		
		return isPalindrome;
	}
}
