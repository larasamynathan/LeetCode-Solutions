class Solution {
    public int[] nextGreaterElement(int[] num1 ,int[] num2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:num2)
        {
            while(!st.isEmpty() && num>st.peek())
            {
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        while(!st.isEmpty())
        {
            map.put(st.pop(),-1);
        }
        int ans[]=new int[num1.length];
        for(int i=0;i<num1.length;i++)
        {
            ans[i]=map.get(num1[i]);
        }
    return ans;
    }
}