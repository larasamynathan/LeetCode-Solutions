class Solution {
    public int calPoints(String[] a) {
        Stack< Integer> stack=new Stack<>();
       for(String s:a)
        {
           
          if(!s.equals("C") && !s.equals("D") &&  !s.equals("+"))
            {
            int n=Integer.parseInt(s);
            stack.push(n);
            }
            else
            {
                if(s.equals("D"))
                {
                    int l= stack.peek();
                    stack.push(l*2);
                }
                else if(s.equals("C"))
                {
                    stack.pop();
                }
                else if(s.equals("+"))
                {
                   int b= stack.pop();
                   int c=stack.peek();
                   stack.push(b);
                   int d=b+c;
                   stack.push(d);
                }
            }
        }
            int sum=0;
            while( !stack.isEmpty())
            {
                sum=sum+stack.pop();
            }
        return sum;
    
}
}