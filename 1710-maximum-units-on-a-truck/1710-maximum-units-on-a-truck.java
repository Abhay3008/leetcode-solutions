class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Sort(boxTypes, 2);
        int amt = 0;
      //  System.out.print(boxTypes[1][1]);
        for(int i = boxTypes.length-1;i>-1;i--){
            if(truckSize==0)
                return amt;
            if(truckSize>=boxTypes[i][0]){
                amt+= boxTypes[i][1]*boxTypes[i][0];
                truckSize-=boxTypes[i][0];
            }
            else if(truckSize<boxTypes[i][0]){
                amt+= boxTypes[i][1]*truckSize;
                truckSize=0;
            }
        }
        return amt;
        
    }
    public static  void Sort(int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] > second[columnNumber-1]) return 1;
               else return -1;
            }
        });
    }
}