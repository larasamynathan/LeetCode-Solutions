class Solution {
    public int firstMissingPositive(int[] a) {
        int n=a.length;
        int i=0;
        while(i<n)
        {
            int correct=a[i]-1;
            if(a[i] > 0 && a[i]<=n && a[i]!=a[correct])
            {
                int temp=a[i];
                a[i]=a[correct];
                a[correct]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;

    }
}