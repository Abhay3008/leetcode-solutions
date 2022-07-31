class NumArray {
    int[] num;
    int len;
    int[] block;
    public NumArray(int[] nums) {
        this.num = nums;
        
        double n = Math.sqrt(num.length);
        len = (int)Math.ceil(num.length/n);
        block = new int[len];
         for(int i = 0;i<num.length;i++){
             block[i/len]+=num[i];
         }
        
    }
    
    public void update(int index, int val) {
       int b = index/len;
        block[b]=block[b]-num[index]+val;
        num[index]=val;
        
    }
    
    public int sumRange(int l, int r) {
        int sum = 0;
        int left = l/len;
        int right = r/len;
        if(left==right){
            for(int i = l;i<=r;i++)
                sum+=num[i];
        }
        else{
            for(int i = l;i<=(left+1)*len-1;i++)
                sum+=num[i];
            for(int i = left+1;i<=right-1;i++)
                sum+=block[i];
            for(int i = right*len;i<=r;i++)
                sum+=num[i];
        }
        return sum;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */