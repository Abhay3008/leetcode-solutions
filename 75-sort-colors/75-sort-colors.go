func sortColors(nums []int)  {
    var zero int = 0
    var two int = len(nums)-1
    // set zero digit in start & two in last, 1 will automatic comes in middle
        for  j := 0;j<=two;j++ {
            if(nums[j] == 0){
                var temp = nums[zero]
                nums[zero] = nums[j]
                nums[j] = temp
                zero++;
            } else if(nums[j] == 2){
                var temp = nums[two]
                nums[two] = nums[j]
                nums[j] = temp
                two--;
                j--;
            }
       }
}