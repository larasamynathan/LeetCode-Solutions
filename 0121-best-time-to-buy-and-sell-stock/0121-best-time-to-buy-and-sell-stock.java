class Solution {
    public int maxProfit(int[] a) {
        int min=a[0];
        int maxprofit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]-min > maxprofit)
            {
                maxprofit=a[i]-min;
            }
        }
        return maxprofit;
    }
}