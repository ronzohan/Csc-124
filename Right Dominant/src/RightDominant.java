import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


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
	  int[] readFile(String filename,int size)
	    {
	         File f = new File(filename);
	           int[] NumArr = new int[size];
	         try
	         {
	         Scanner sc = new Scanner(f);
	          int idx = 0;
	       
	         while(sc.hasNext() && idx != size){

	             NumArr[idx] = sc.nextInt();
	             idx++;
	         }
	        
	         }
	         catch(FileNotFoundException e)
	         {
	             
	             
	         }
	        
	        return NumArr;
	    }
	    
}
