class Solution {
    public boolean containsDuplicate(int[] a) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:a)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}