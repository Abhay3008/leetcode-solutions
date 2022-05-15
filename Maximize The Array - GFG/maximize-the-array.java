// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr1 = new int[n], arr2 = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().maximizeArray(arr1, arr2, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
        // code here
        int[] arr = new int[2*n];
        ArrayList<Integer> ls  = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int x = 0;
        for(int i = 0;i<n;i++){
            arr[x++] = arr1[i];
            arr[x++] = arr2[i];
        }
        Arrays.sort(arr);
        for(int i = arr.length-1;i>=0 && set.size()<n;i--){
            set.add(arr[i]);
        }
        for(int i = 0;i<n;i++){
            if(set.contains(arr2[i])){
                ls.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        for(int i = 0;i<n;i++){
            if(set.contains(arr1[i])){
                ls.add(arr1[i]);
                set.remove(arr1[i]);
            }
        }
        
        
    
        return ls;
        
    }
}