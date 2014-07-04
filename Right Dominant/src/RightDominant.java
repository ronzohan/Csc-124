import java.awt.List;
import java.util.ArrayList;


public class RightDominant {

	public ArrayList<Integer> findRightDominant(int[] numArray)
	{
		int key;
		int count=0; //count for right dominant
		 
		ArrayList<Integer>  answerArray = new ArrayList<Integer>();
		
		for(int i = 0;i<numArray.length;i++)
		{
			key = numArray[i];
			for(int j=i+1;j<numArray.length;j++)
			{
				if (key < numArray[j])
				{
					key = numArray[j];
					i = j;
				}
				
			}
			answerArray.add(key);
			
		}
		
		return answerArray;
	}
}
