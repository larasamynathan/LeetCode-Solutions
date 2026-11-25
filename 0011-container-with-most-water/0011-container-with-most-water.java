class Solution {
    public int maxArea(int[] a) {
        int l=0;
        int r=a.length-1;
        int maxarea=0;
        while(l < r)
        {
          int w=r-l;
          int h=Math.min(a[l],a[r]);
          int area=w*h;
          maxarea=Math.max(maxarea,area);
          if(a[l]<a[r])
          {
            l++;
          }  
          else
          {
            r--;
          }
        }
        return maxarea;
    }
}