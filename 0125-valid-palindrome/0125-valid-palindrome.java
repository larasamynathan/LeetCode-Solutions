class Solution {
    public boolean isPalindrome(String t) {
     t=t.toLowerCase();
        char s[]=t.toCharArray();
        int start=0;
        int end=s.length-1;
        boolean palindrome=true;
      
        while(start<end){
            while(start<end && ! Character.isLetterOrDigit(s[start]))
            {
                start++;
            }
            while(start<end && ! Character.isLetterOrDigit(s[end]))
            {
                end--;
            }
            if(s[start]!=s[end]){
                palindrome=false;
                break;
            }
          start++;
          end--;
        }
        return palindrome;
    }
}