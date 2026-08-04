class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        String s1="";
        for(int i=words.length-1;i>=0;i--)
        {
            s1=s1+words[i];
            if(i>0)
            {
                s1=s1+" ";
            }
        }
        return s1;
    }
}