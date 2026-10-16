class Solution {
    public int minEatingSpeed(int[] p, int h) {
        if(p.length>h)
        {
            return 0;
        }
        int l=1;
        int r=-1;
        for(int i=0;i<p.length;i++)
        {
            r=Math.max(r,p[i]);
        }
        int ans=0;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            int time=0;
            for(int i=0;i<p.length;i++)
            {
                time+=Math.ceil((double)(p[i])/m);
            }
            if(time>h)
            {
                l=m+1;
            }
            else
            {
                ans=m;
                r=m-1;
            }
        }
      return ans;  
    }
}