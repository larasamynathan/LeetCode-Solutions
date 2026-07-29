class Solution {
    public int[] sortedSquares(int[] a) {
        int result[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            result[k]=a[i]*a[i];
            k++;
        }
       Arrays.sort(result);
        return result;
    }
}