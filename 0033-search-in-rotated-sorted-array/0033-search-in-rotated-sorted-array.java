class Solution {
    public int search(int[] a, int target) {
        int index=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                index=i;
            }
        }
       return index; 
    }
}