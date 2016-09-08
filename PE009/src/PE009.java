
public class PE009 {
	public static void main(String[] args)
	{
		for(int i = 1; i <= 1000; i++)
			for(int j = 1; j <= 1000; j++)
				for(int z = 1; z <= 1000; z++)
					if(i + j + z == 1000)
					{
						int largest = i >= j ? i >= z ? i : z : j >= z ? j : z;
						if(i * i + j * j + z * z == 2 * largest * largest)
							System.out.println(i + " " + j + " " + z);
					}
	}
}
