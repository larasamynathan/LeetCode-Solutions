class Solution {
    public int[] buildArray(int[] a) {
        int result[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            result[i]=a[a[i]];
        }
        return result;
    }
}