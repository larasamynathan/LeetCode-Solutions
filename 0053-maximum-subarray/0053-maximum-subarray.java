class Solution {
    public int maxSubArray(int[] a) {
        int max=a[0];
        int cur=a[0];
        for(int i=1;i<a.length;i++)
        {
            cur=Math.max(a[i],a[i]+cur);
            max=Math.max(max,cur);
        }
        return max;
    }
}