class Solution {
    public int[] productExceptSelf(int[] a) {
       int leftproduct []=new int[a.length];
       int rightproduct []=new int [a.length];
       leftproduct[0]=1;
       rightproduct[a.length-1]=1;
       for(int i=1;i<a.length;i++)
       {
        leftproduct[i]=leftproduct[i-1]*a[i-1];
       }
       for(int i=a.length-2;i>=0;i--)
       {
        rightproduct[i]=rightproduct[i+1]*a[i+1];
       }
       for(int i=0;i<a.length;i++)
       {
        if(i==0)
        {
            a[0]=rightproduct[i];
        }
        else if(i==a.length-1)
        {
            a[a.length-1]=leftproduct[i];
        }
        else
        {
            a[i]=leftproduct[i]*rightproduct[i];
        }
       }
       return a;
    }
} 