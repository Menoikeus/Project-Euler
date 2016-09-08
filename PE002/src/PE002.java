
public class PE002 {
	public static void main(String[] args)
	{
		int n1 = 1, n2 = 1;
		int count = 0;
		
		int test = 0;
		
		while(n1 < 4000000)
		{
			
			int temp = n2;
			n2 = n1 + n2;
			n1 = temp;
			
			if(n1 % 2 == 0)
				count += n1;
		}
		
		System.out.println(count);
	}
}
