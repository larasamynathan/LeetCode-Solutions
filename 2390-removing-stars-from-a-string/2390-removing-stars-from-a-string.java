class Solution {
    public String removeStars(String s) {
        StringBuilder x=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='*'){
                x=x.append(c);
            }
            else if(c=='*')
            {
           x= x.deleteCharAt(x.length()-1);
           

            }
        }
        return x.toString();
    }
}