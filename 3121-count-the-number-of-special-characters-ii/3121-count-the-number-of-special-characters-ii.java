class Solution {
    public int numberOfSpecialChars(String s) {
        int count=0;
       for(char c='a';c<='z';c++)
        {
            char u=Character.toUpperCase(c);
            int lpos=s.lastIndexOf(c);
            int upos=s.indexOf(u);
            if( lpos!=-1 && upos!=-1 && lpos<upos )
            {
                count=count+1;
            }
                
                
            
        }
        return count;
    }
}