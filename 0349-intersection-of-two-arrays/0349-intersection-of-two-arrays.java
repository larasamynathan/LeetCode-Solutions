class Solution {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:a)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }
        int result[]=new int[Math.min(a.length,b.length)];
        int k=0;
       for(int i=0;i<b.length;i++)
       {
        if(set.contains(b[i]))
        {
           
            result[k]=b[i];
            k++;
            set.remove(b[i]);
        }
       }
       return Arrays.copyOf(result,k);
    }
}