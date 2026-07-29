class Solution {
    public int removeElement(int[] a, int val) {
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val)
            {   a[k]=a[i];
                k=k+1;
            }
        }
        return k;
        
    }
}