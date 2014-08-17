import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Tester{

	public static void main(String[] args) throws FileNotFoundException {
		SortingClass sort = new SortingClass();
		int size = 15000;
	//	Integer[] numArr = new Integer[size]; //generic does not support primitive data types i.e. int
	    int[] numArr = new int[size];
		numArr = readFromFile("sorted15000.txt", numArr, size);
		
        long start,end,total;
        
        
        start = System.currentTimeMillis();
		sort.quickSort(numArr, 0, numArr.length-1);
		end = System.currentTimeMillis();
		total = end - start;
		System.out.print("Sorted number:");
	
		for(int i=0;i<numArr.length;i++)
			System.out.print(numArr[i]+",");
	    System.out.println("\nTotal time:"+total + "ms");
	}
	public static Integer[] readFromFile_int(String filename,Integer[] numArr,int size) throws FileNotFoundException
	{
		 numArr = new Integer[size];
		 File f = new File(filename);
         Scanner sc = new Scanner(f);
         int idx = 0;
         while(sc.hasNext()){
        	 numArr[idx] = sc.nextInt();
       
             idx++;
         }

         return numArr;

	}
	public static int[] readFromFile(String filename,int[] numArr,int size) throws FileNotFoundException
	{
		 numArr = new int[size];
		 File f = new File(filename);
         Scanner sc = new Scanner(f);
         int idx = 0;
         while(sc.hasNext() && idx <size){
        	 numArr[idx] = sc.nextInt();
       
             idx++;
         }

         return numArr;

	}

}
