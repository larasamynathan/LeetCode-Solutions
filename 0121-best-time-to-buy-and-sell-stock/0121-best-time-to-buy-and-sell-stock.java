class Solution {
    public int maxProfit(int[] a) {
        int min=a[0];
        int maxp=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            else
            {
                int profit=a[i]-min;
                if(profit>maxp)
                {
                    maxp=profit;
                }
            }
        }
        return maxp;
    }
}