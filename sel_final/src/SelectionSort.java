/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author u2012-0377
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SelectionClass sc = new SelectionClass();
        int size = 15000;
        int[] NumArr = new int[size];
        long start,end,total;
        String filename = "reverse15000.txt";
        
       NumArr = sc.readFile(filename, size);
         
        
    
        
        start = System.nanoTime();
        int[] newNumArr = new int[size];
        newNumArr = sc.selectionSort(NumArr,size);
        end =  System.nanoTime();
        total = end - start;
        
        for(int i=0;i<size;i++)
            System.out.print(newNumArr[i]+ " ");
        System.out.println();
        System.out.println(total+" ms");
    }
}
