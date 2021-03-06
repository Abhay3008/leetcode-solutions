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
        if(n<=1) return ;
        insertionSort(arr, n-1);
        int val = arr[n-1];
        int i = n-2;
        while(i>=0 && arr[i]>val){
            arr[i+1]= arr[i];
            i--;
        }
        arr[i+1] = val;
    }
}