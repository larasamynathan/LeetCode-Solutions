class Solution {
    public int findNumbers(int[] a) {
        int evencount=0;
        for(int i=0;i<a.length;i++){
            int n=a[i];
            int count=0;
            while(n!=0){
                n=n/10;
                count++;
            }if(count%2==0){
                evencount ++;
            }
        }
       return evencount;
    }
}