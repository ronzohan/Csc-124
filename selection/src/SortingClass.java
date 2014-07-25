 
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
	
	public  void merge(int[] numArray,int p,int q,int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		
		int i;
		int j;
		
		int[] LeftArr = new int[n1];
		int[] RightArr = new int[n2];
		
		for (i = 0;i<n1;i++)
			LeftArr[i] = numArray[p+i];
		
		for (j = 0;j<n2;j++)
			RightArr[j] = numArray[q+j+1];
		
		i = 0;
		j = 0;
		int k ;
		for (k = p;k<r;k++)
		{
			if (LeftArr[i] <= RightArr[j])
			{
				numArray[k] = LeftArr[i];
				i++;
			}
			else
			{
				numArray[k] = RightArr[j];
				j++;
			}
		}
		while (i<LeftArr.length)
			numArray[++k] = LeftArr[i++];
		while (j<RightArr.length)
			numArray[++k] = RightArr[j++];
	}
	
	public void mergeSort(int[] numArray,int p, int r)
	{
		int q;
		if (p<r)
		{
			q = (p+r)/2;
			mergeSort(numArray, p, q);
			mergeSort(numArray,q+1,r);
			merge(numArray,p,q,r);
		}
		
	}
	
	
}
