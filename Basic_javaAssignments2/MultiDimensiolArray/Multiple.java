
public class Multiple {
	public boolean searchNumber(int Number, int[][] array)
	{
		boolean answer=false;
		for(int count = 0;count < array.length;count++)
		{
			for(int count1 = 0;count1 < array[0].length; count1++)
			{
				if(array[count][count1]== Number)
				{
					answer = true;

				}
			}
		}
		return answer;
	}
}
