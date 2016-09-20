import java.util.ArrayList;


public class PE026 {
	public static void main(String[] args)
	{
		int highest = 0, highestIndex = 0;
		for(int i = 1; i < 1000; i++)
		{
			ArrayList<Integer> remainders = new ArrayList<Integer>();
			remainders.add(new Integer(1));
			
			int length = -1;
			boolean done = false;
			while(length == -1)
			{
				int r = (remainders.get(remainders.size()-1).intValue()*10)%i;
				//System.out.println("Remainder: " + r);
				int lastFoundIndex = isInBackwards(r, remainders);
				//System.out.println("Loc: " + lastFoundIndex);
				if(lastFoundIndex != -1)
					length = remainders.size() - lastFoundIndex;
				else
					remainders.add(new Integer(r));
			}
			
			System.out.println(length);
			if(length > highest)
			{
				highest = length;
				highestIndex = i;
			}
		}
		System.out.println("Highest: " + highest + "\nNumber: " + highestIndex);
	}
	
	public static int isInBackwards(int n, ArrayList<Integer> list)
	{
		//System.out.println("Size: " + list.size());
		for(int i = list.size()-1; i >= 0; i--)
			if(n == list.get(i).intValue())
				return i;
		return -1;
	}
}

/*
1/6 : 1
10/6 : 4
40/6 : 4
40/6 : 4
*/

/*for(int i = 1; i < 1000; i++)
{
	int i = 6;
	double num = 1./i;
	String aNum = Double.toString(num);
	System.out.println("1/" + i + ": " + aNum);
	
	int repeatDigit = 1;
	String aRepeatValue = "";
	int start = 0;
	boolean done = false;
	while(done == false || start != 16)
	{
		while(repeatDigit < 17/2 +2)
		{
			String repeatVal = aNum.substring(2 + start, 2 + repeatDigit);
			System.out.println("Repeat Value: " + repeatVal);
			
			boolean repeated = true;
			for(int j = 0; j < (aNum.length() - (2+start))/repeatVal.length() && repeated == true; j++)
			{
				System.out.println("Check: " + aNum.substring( repeatVal.length() * j + 2+start, repeatVal.length() * (j+1) + 2+start));
				if(!repeatVal.equals(aNum.substring( repeatVal.length() * j + 2+start, repeatVal.length() * (j+1) + 2+start)))
				{
					repeated = false;
					System.out.println("Failed: " + repeatVal);
				}
				else if((aNum.length() - 2)/repeatVal.length() == 1)
				{
					repeated = false;
					System.out.println("Failed: too long");
				}
			}
			if(repeated == true)
			{
				done = true;
				aRepeatValue = repeatVal;
			}
			repeatDigit++;
		}
		start++;
		repeatDigit = 0;
		//System.out.println("Hey");
	}
	System.out.println(aRepeatValue.length() + ": " + aRepeatValue);
}*/