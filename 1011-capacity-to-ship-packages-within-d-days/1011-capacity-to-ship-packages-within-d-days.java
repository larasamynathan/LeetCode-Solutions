class Solution {
    public static int calnumdays(int weight[],int capacity)
    {
        int days=1;
        int curr=0;
        for(int i=0;i<weight.length;i++)
        {
            curr+=weight[i];
            if(curr>capacity)
            {
                days+=1;
                curr=weight[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] w, int days) {
        
        int totalweight=0;
        int maxweight=0;
        for(int i=0;i<w.length;i++)
        {
            totalweight+=w[i];
            maxweight=Math.max(maxweight,w[i]);
        }
        int mincapacity=maxweight;
        int maxcapacity=totalweight;
        int ans=0;
        while(mincapacity<=maxcapacity)
        {
            int currcapacity=mincapacity+(maxcapacity-mincapacity)/2;
            int numdays=calnumdays(w,currcapacity);
            if(numdays > days)
            {
                mincapacity=currcapacity+1;
            }
            else if(numdays <= days)
            {
                ans=currcapacity;
                maxcapacity=currcapacity-1;
            }
        }
        return ans;
    }
}