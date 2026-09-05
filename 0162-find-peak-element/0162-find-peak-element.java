class Solution {
    public int findPeakElement(int[] a) {
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]<a[mid+1])
            {
                l=mid+1;
            }
            else if(a[mid]>a[mid+1])
            {
                r=mid;
            }

        }
        return r;
    }
}