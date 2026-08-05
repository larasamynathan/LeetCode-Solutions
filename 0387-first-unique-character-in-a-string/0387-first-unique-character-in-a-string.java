class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                return i;
            }
        }
        return index;
    }
}