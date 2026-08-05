class Solution {
    public int pivotIndex(int[] a) {
        int n=a.length;
        int leftsum=0;
        int rightsum=0;
        a[0]=a[0];
        for(int i=1;i<n;i++)
        {
            a[i]=a[i]+a[i-1];
        }
       for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                leftsum=0;
            }
            else
            {
                leftsum=a[i-1];
            }
            rightsum=a[n-1]-a[i];
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
    }
}