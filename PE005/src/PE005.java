import java.util.ArrayList;

public class PE005 {
	public static void main(String[] args)
	{
		long num = 1;
		
		for(int i = 2; i <= 20; i++)
		{
			System.out.print(i + "\t\t");
			ArrayList<Integer> pF = getPrimeFactorization(i);
			int storedNumber = -1;
			int occurrences = 1;
			for(Integer v : pF)
			{
				if(v == storedNumber)
					occurrences += 1;
				else
				{
					storedNumber = v;
					occurrences = 1;
				}
				System.out.print(v + " ");
				if(num % Math.pow(v, occurrences) != 0)
					num *= v;
			}
			System.out.println("\t\t" + num);
		}
		System.out.print(num);
	}

	public static ArrayList<Integer> getPrimeFactorization(long num)
	{
		ArrayList<Integer> primeFactorization = new ArrayList<Integer>();
		for(long i = 2L; i <= num && num != 1; i++)
        {
        	//System.out.println(i);
            if(num % i == 0)
            {
            	primeFactorization.add(new Integer((int) i));
                num = num/i;
                i--;
            }
        }
		return primeFactorization;
	}
}

// 349188840
// 5587021440
// 232792560