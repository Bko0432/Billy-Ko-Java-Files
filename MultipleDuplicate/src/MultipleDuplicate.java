
	import java.util.*;
	public class MultipleDuplicate
	{
		public static void main(String[] args)
		{
			int[] array = {4 , 2, 3, 2, 4, 3, 5, 5, 88, 90, 91, 88, 66, 666, 666, 66, 98, 97, 100};
			int duplicate[] = new int [array.length];
			int duplicateCounter = 0;
			for (int i = 0; i < array.length; i++)
			{
				for (int j = 0;  j < array.length; j++)
				{
					if (array[i] == array[j] && i != j)
					{
						duplicate[i] = array[i];
						if (duplicate[i] == duplicate[j])
						{
							continue;
						}
						duplicateCounter++;
						System.out.println("A duplicate number was found, it was " + duplicate[i]);
					}
				}
			}
			System.out.println("The total number of duplicates found were " + duplicateCounter);
		} 
	}

