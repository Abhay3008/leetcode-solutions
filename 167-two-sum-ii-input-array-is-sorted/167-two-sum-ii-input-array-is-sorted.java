class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int start = 0, end = numbers.length-1;
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(numbers[start] == (target - numbers[end]))
                return new int[]{start + 1, end + 1};
            else if (numbers[start] < (target-numbers[end])) {
                start = (numbers[mid] < (target-numbers[end])) ? mid : start + 1;
            }else{
                end = (numbers[mid] > (target-numbers[start])) ? mid : end - 1;
            }
        }
        if(numbers[start] == (target - numbers[end]))
            return new int[]{start + 1, end + 1};
        return new int[]{-1,-1};
    }
}