class Solution {
    public boolean isArraySpecial(int[] a) {
        boolean result=true;
        if(a.length==1)
        {
            result=true;
        }
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]%2==0 && a[i+1]%2==0)
            {
                result=false;
                return result;
            }
             else if(a[i]%2!=0 && a[i+1]%2!=0)
             {
                result=false;
                return result;
             }
        }
        return result;
        
    }
}