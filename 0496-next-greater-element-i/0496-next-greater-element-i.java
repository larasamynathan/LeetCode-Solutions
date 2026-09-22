class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int result[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])

                { 
                    int max=-1;
                    for(int k=j+1;k<b.length;k++)
                    {
                        if(a[i]<b[k])
                        {
                            max=b[k];
                            break;
                        }
                       
                    }
                    result[i]=max;
                    break;
                }
            }
        }
        return result;
    }
}