public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + (n % 26)));
            System.out.println(result);
            n /= 26;
        }

        return result.toString();
    }
}