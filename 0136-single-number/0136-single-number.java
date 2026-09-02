class Solution {
    public int singleNumber(int[] a) {
        Map<Integer,Integer> set=new HashMap<>();
        for(int num:a)
        {
            set.put(num,set.getOrDefault(num,0)+1);
        }
        for(int num:a)
        {
            if(set.get(num)==1)
            {
                return num ;
            }
        }
        return 0;
    }
}