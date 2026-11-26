class Solution {
    public int trap(int[] a) {
        int l []=new int[a.length];
        int r []=new int[a.length];
        int max=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            l[i]=max;
        }
        max=-1;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
            r[i]=max;
        }
        int total=0;
        for(int i=0;i<a.length;i++)
        {
            total+=Math.min(r[i],l[i])-a[i];
        }

       return total; 
    }
}