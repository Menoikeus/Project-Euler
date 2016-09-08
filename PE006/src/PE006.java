
public class PE006 {
	public static void main(String[] args)
	{
		long sumOfSquares = 0;
		long sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
			sumOfSquares += Math.pow(i, 2);
		}
		long squareOfSum = (long)Math.pow(sum, 2);
		
		System.out.print(sumOfSquares - squareOfSum);
	}
}
