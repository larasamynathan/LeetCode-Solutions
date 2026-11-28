class Solution {
    public String minWindow(String s, String t) {
        int freq []= new int[128];
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)]++;
        }
        int left=0;
        int start=0;
        int minlength=Integer.MAX_VALUE;
        int req=t.length();
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(freq[ch]>0)
            {
                req--;
            }
            freq[ch]--;
            while(req==0)
            {
                if(right-left+1<minlength)
                {
                    minlength=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0)
                {
                    req++;
                }
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE ?"":s.substring(start,start+minlength);
    }
}