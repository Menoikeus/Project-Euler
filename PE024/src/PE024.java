
public class PE024 {
	public static void main(String[] args)
	{
		int count = 1;
		String num = "";
		
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++)
				if(j != i)
					for(int k = 0; k < 10; k++)
						if(!isEqualToAny(k, new int[]{i,j}))
							for(int l = 0; l < 10; l++)
								if(!isEqualToAny(l, new int[]{i,j,k}))
									for(int m = 0; m < 10; m++)
										if(!isEqualToAny(m, new int[]{i,j,k,l}))
											for(int n = 0; n < 10; n++)
												if(!isEqualToAny(n, new int[]{i,j,k,l,m}))
													for(int o = 0; o < 10; o++)
														if(!isEqualToAny(o, new int[]{i,j,k,l,m,n}))
															for(int p = 0; p < 10; p++)
																if(!isEqualToAny(p, new int[]{i,j,k,l,m,n,o}))
																	for(int q = 0; q < 10; q++)
																		if(!isEqualToAny(q, new int[]{i,j,k,l,m,n,o,p}))
																			for(int r = 0; r < 10; r++)
																			{
																				if(!isEqualToAny(r, new int[]{i,j,k,l,m,n,o,p,q}))
																				{
																					num = ("" + i + j + k + l + m + n + o + p + q + r);
																					System.out.println(count + ": "+ num);
																					
																					if(count == 1000000)
																					try {
																						Thread.sleep(1000000);
																					} catch (InterruptedException e) {
																						// TODO Auto-generated catch block
																						e.printStackTrace();
																					}
																					count++;
																				}
																			}
						
		//num = Integer.parseInt(("" + i + j + k));
		//System.out.println(num);
						
		/*
		for(int i = 0; i < 1; i++)
			for(int j = 0; j < 1; j++)
				for(int k = 0; k < 1; k++)
					for(int l = 0; l < 1; l++)
						for(int m = 0; m < 1; m++)
							for(int n = 0; n < 1; n++)
								for(int o = 0; o < 1; o++)
									for(int p = 0; p < 3; p++)
										for(int q = 0; q < 3; q++)
											for(int r = 0; r < 3; r++)
											{
												num = Integer.parseInt(("" + i + j + k + l + m + n + o + p + q + r));
												System.out.println(num);
											}*/
	}
	
	public static boolean isEqualToAny(int n, int[] numbers)
	{
		boolean isEqual = false;
		for(int i = 0; i < numbers.length; i++)
			if(n == numbers[i])
				isEqual = true;
		return isEqual;
	}
}
