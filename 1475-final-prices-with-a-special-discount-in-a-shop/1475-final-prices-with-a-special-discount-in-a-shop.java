class Solution {
    public int[] finalPrices(int[] a) {

    for(int i=0;i<a.length;i++)
    {
       for(int j=i+1;j<a.length;j++){
        if(a[j]<=a[i])
        {
          a[i]=a[i]-a[j];
          break;
        }
        else
        {
            a[i]=a[i];
        }
       }
    }
       return a; 
    }
}