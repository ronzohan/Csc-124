 
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
	
	private void merge(int[] numArray,int p,int q,int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for (int i=0;i<n1;i++)
			leftArr[i] = numArray[p+i];
		for (int j=0;j<n2;j++)
			rightArr[j] = numArray[q+j+1];
		
		int i=0;
		int j=0;
		int k ;
		for(k = p;k<r;k++)
			if (leftArr[i] <= rightArr[j])
			{
				numArray[k] = leftArr[i];
				i++;
				if (i == leftArr.length)
				{
					k++;
					break;
				}
			}
			else
			{
				numArray[k] = rightArr[j];
				j++;
				if (j >= rightArr.length)
				{
					k++;
					break;
				}
			}
		
		for(int m=i;m<leftArr.length;m++)
		{
			numArray[k] = leftArr[m];
			k++;
		}		
		for(int n=j;n<rightArr.length;n++)
		{
			numArray[k] = rightArr[n];
			k++;
		}	
			
	}
	
	public void mergeSort(int[] numArray,int p,int r)
	{
		if (p<r)
		{
			int q = (p+r)/2;
			mergeSort(numArray, p, q);
			mergeSort(numArray, q+1, r);
			merge(numArray,p,q,r);
		}
	}	
	
	public void quickSort(int[] numArray,int p,int r)
	{

		if (p<r)
		{
			int q = partition(numArray,p,r);
			quickSort(numArray,p,q-1);
			quickSort(numArray,q+1,r);
		
		}
	}
	
	public int partition(int[] numArray,int p,int r)
	{
		int x = numArray[r];
		int i = p-1;
		for(int j = p;j<r;j++)
		{
			if (numArray[j] <= x)
			{
				i++;
				int temp = numArray[i];
				numArray[i] = numArray[j];
				numArray[j] = temp;
			}
		}
		int temp = numArray[i+1];
		numArray[i+1] = numArray[r];
		numArray[r] = temp;
		return i+1;
	}
}
