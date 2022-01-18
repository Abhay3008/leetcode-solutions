func sortColors(nums []int)  {
    var pos int = 0
    for i:=0;i<2;i++ {
        for  j := pos;j<len(nums);j++ {
            if(nums[j] == i){
                var temp = nums[pos]
                nums[pos] = nums[j]
                nums[j] = temp
                pos++;
            }
        }
    }
}