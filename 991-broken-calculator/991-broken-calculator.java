class Solution {
    public int brokenCalc(int start, int target) {
        
        
        int count = 0;
        while(start!=target){
            if(start>target){
                count+=(start-target);
                break;
            }
            else{
                if((target&1)==1)
                    target++;
                else
                    target/=2;
            count++;
                
            }
            System.out.print(count+" ");
            
        }
        return count;
    }
}