// { Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}// } Driver Code Ends


class Solution
{
     static void insert(int arr[],int x, int j)
    {
        // Your code here
        int val = arr[x];
        for(int i = x;i>j;i--){
            arr[i]=arr[i-1];
        }
        arr[j] = val;

    }
    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int arr[], int n)
    {
        //code here
        int j = 0;
        if(n==1) return ;
        for(int i = 1;i<n;i++){
            for( j = i-1;j>-1;j--){
                if(arr[j]<arr[i])
                    break;
            }
            if((j+1)!=i)
                insert(arr, i, j+1);
        }
    }
}