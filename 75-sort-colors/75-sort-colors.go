func sortColors(nums []int)  {
    var zero int = 0
    var two int = len(nums)-1
    //for i:=0;i<2;i++ {
        
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
            //fmt.Println(nums)
       }
}