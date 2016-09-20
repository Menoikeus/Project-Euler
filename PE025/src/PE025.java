
public class PE025 {
	public static void main(String[] args)
	{
		int count = -1;
		long first = 1;
		long second = 1;
		
		boolean done = false;
		while(!done)
		{
			count+= 2;
			first = second + first;
			second = first + second;
			System.out.println(first + " " + second);
			
			if(second < 0 || first < 0)
				done = true;
		}
		//4 5 54 5 5 5 4 5 5 5 5 4 5  5 5 5 4
	}
}