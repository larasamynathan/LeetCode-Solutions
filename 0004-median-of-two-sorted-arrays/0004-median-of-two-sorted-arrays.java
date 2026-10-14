class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int r[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
            {
                r[k++]=a[i++];
            }
            else
            {
                r[k++]=b[j++];
            }
        }
        while(i<n1)
        {
            r[k++]=a[i++];
        }
        
        while(j<n2)
        {
            r[k++]=b[j++];
        }
        int len=r.length;
        if(len%2==1)
        {
            return(r[len/2]);
        }
        return (r[len/2-1]+(double)r[len/2])/2;
    }
}