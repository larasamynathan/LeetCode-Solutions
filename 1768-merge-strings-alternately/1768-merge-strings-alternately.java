class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i=0;
        int j=0;
         StringBuilder sb=new StringBuilder();
         
        while(i<s1.length () && j<s2.length())
        {
           char c1=s1.charAt(i);
           sb=sb.append(c1);
           char c2=s2.charAt(j);
           sb=sb.append(c2);
           i++;
           j++;
        }
        while(j<s1.length())
        {
         sb=sb.append(s1.charAt(j));
         j++;
        }
        while(i<s2.length())
        {
            sb=sb.append(s2.charAt(i));
            i++;
        }
         
      return sb.toString();   
    }
}