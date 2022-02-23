// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            boolean arr1[] = new boolean[n];
            boolean arr2[] = new boolean[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = str[i].equals("1") ? true : false;
            }
            str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = str[i].equals("1") ? true : false;
            }

            int ans = new Solution().longestCommonSum(arr1, arr2, n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        // code here
        int temp[] = new int[n];
        for(int i = 0;i<n;i++){
            int x = arr1[i]==true?1:0;
            int y = arr2[i]==true?1:0;
            temp[i] = x-y;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0,presum=0;
        for(int i = 0;i<n;i++){
            presum+=temp[i];
            if(presum==0)
            res = i+1;
            if(map.containsKey(presum)==false)
            map.put(presum,i);
            if(map.containsKey(presum))
            res = Math.max(res,i-map.get(presum));
        }
        return res;
    }
}