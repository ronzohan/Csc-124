import java.util.ArrayList;
import java.util.Random;


public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RightDominant rd = new RightDominant();
		int size = 15000;
		int[] numArray = new int[size];
		//= new int[] {10, 9, 5, 13, 2, 7, 1, 8, 4, 6, 3};
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		numArray = rd.readFile("sorted15000.txt", size);
	    //numArray =  createRandom(numArray);
	    for(int k =0;k<size;k++)
	    	System.out.print(numArray[k]+" ");
	    System.out.println();
	    long start,end,total;
	    
	    start = System.currentTimeMillis();
		arrayList = rd.findRightDominant(numArray);
		 end = System.currentTimeMillis();
		 total = end - start;
	
		for(int i =0;i<arrayList.size();i++)
			System.out.print(arrayList.get(i) + " ");
		 System.out.println("\n" +total+" ms");

	}
	public static int[] createRandom(int[] numArray)
	{
		Random rd = new Random();
		for(int i =0;i<numArray.length;i++)
			numArray[i] = rd.nextInt(1000000);
		System.out.print(" ");
		return numArray;
	}

}
