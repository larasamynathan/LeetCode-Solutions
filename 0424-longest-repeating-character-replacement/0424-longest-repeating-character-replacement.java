class Solution {
    public int characterReplacement(String s, int k) {
      int [] freq= new int[26];
      int l=0;
      int maxf=0;
      int maxlength=0;
      for(int r=0;r<s.length();r++)
      {
        char c=s.charAt(r);
        freq[c-'A']++;
        maxf=Math.max(maxf,freq[c-'A']);
        int windowsize=r-l+1;
        if(windowsize-maxf >k)
        {
            freq[s.charAt(l)-'A']--;
            l++;
        }
        maxlength=Math.max(maxlength,r-l+1);
      } 
      return maxlength; 
    }
}