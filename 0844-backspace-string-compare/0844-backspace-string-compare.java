class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> ts=new Stack<>();

        for(char c:s.toCharArray())
        {
            if(c=='#')
            {
               if(!st.isEmpty())
               {
                st.pop();
               }
            }
            else
            {
                st.push(c);
            }
        }
        for(char c:t.toCharArray())
        {
            if(c=='#')
            {
                if(! ts.isEmpty()){

                
                ts.pop();
                }
            }
            else
            {
                ts.push(c);
            }
        }
       return st.equals(ts);
}
}
