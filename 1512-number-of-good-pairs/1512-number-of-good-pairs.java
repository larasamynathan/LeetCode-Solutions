class Solution {
    public int numIdenticalPairs(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                {
                    count=count+1;
                }
            }
        }
        return count;
    }
}