class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        
        for(int i=0;i<stones.length();i++)
        {   
           String stone=String.valueOf(stones.charAt(i));
        if(jewels.contains(stone))
        {
            count++;
        }
        }
     return count;   
    }
}