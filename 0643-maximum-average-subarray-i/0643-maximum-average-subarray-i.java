class Solution {
    public double findMaxAverage(int[] a, int k) {
        
        double winsum=0;
        for(int i=0;i<k;i++)
        {
            winsum=winsum+a[i];
        }
         double maxi=winsum;
        for(int i=k;i<a.length;i++){
            winsum=winsum+a[i]-a[i-k];
            maxi=Math.max(winsum,maxi);
        }
        return maxi/k;
    }
}