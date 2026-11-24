class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> re=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++)
        {
            if(i==0 || i>0 && a[i]!=a[i-1])
            {
                int l=i+1;
                int r=a.length-1;
                int t=-a[i];
                while(l<r)
                {
                    if(t==a[l]+a[r])
                    {
                        re.add(Arrays.asList(a[i],a[l],a[r]));
                    
                    while(l<r && a[l]==a[l+1]) l++;
                    while(l<r && a[r]==a[r-1]) r--;
                    l++;
                    r--;
                    }
                    else if(a[l]+a[r]<t)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        
        }
        return re;
    }
}