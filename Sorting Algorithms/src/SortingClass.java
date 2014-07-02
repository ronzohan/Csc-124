 
public class SortingClass
{
	
	public <E extends Comparable<E>> void insertionSort(E[]  objectArray)
	{
		int j =0;
		int i;
		E key;
		for (j = 1;j<objectArray.length;j++)
		{
			key = objectArray[j];
			i = j-1;
			while (i>=0 && (objectArray[i].compareTo(key)) > 0)
			{
				objectArray[i+1] = objectArray[i];
				i--;
			}
			objectArray[i+1] = key;
		}
		
	}
}
