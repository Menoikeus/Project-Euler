import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PE022 {
	public static void main(String[] args)
	{
		ArrayList<String> textLines = new ArrayList<String>();
		try 
		{
			textLines = (ArrayList<String>) Files.readAllLines(Paths.get("C:/Users/Dat-Thanh Nguyen/workspace/PE022/p022_names.txt"));
		} catch (IOException e) {}
		
		String all = new String();
		for(String s : textLines)
			all += s;
		
		all = all.replace("\"", "");
		String[] names = all.split(",");
		
		for(int i = 0; i < names.length; i++)
		{
			int lowestIndex = i;
			for(int j = i; j < names.length; j++)
			{
				if(names[j].compareToIgnoreCase(names[lowestIndex]) < 0)
					lowestIndex = j;
			}
			
			String temp = names[i];
			names[i] = names[lowestIndex];
			names[lowestIndex] = temp;
		}
		
		for(String s : names)
			System.out.println(s);
		
		int totalScore = 0;
		for(int i = 0; i < names.length; i++)
		{
			totalScore += (i+1) * getWordValue(names[i]);
		}
		
		System.out.println("Total Score: " + totalScore);
	}
	
	public static int getWordValue(String s)
	{
		int score = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++)
			score += (int)s.charAt(i)-96;
		return score;
	}
}
