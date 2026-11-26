class Solution {
    public boolean isPalindrome(String t)
    {
        t=t.toLowerCase();
        int start=0;
        int end=t.length()-1;
        boolean palindrome=true;
        while(start<end)
        {
            while(start<end && ! Character.isLetterOrDigit(t.charAt(start)))
            {
                start++;

            }
            while(start<end && ! Character.isLetterOrDigit(t.charAt(end)))
            {
                end--;
            }
            if(t.charAt(start)!=t.charAt(end))
            {
             palindrome=false;
             break;
            }
            start++;
            end--; 
        }
        return palindrome;
    }
}