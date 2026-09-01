class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<a.length;i++){
        int complement=target-a[i];
        if(seen.containsKey(complement))
        {
            return new int[]{seen.get(complement),i};
        }
        seen.put(a[i],i);
        }
        return new int[]{};
    }
    
}