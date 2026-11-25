class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> ans=new ArrayList<>();
        int cls=0;
        int rs=0;
        int re=m.length-1;
        int cle=m[0].length-1;
        while(rs<=re && cls <=cle){
        for(int i=cls;i<=cle;i++)
        {
            ans.add(m[rs][i]);
        }
        rs++;
        for(int i=rs;i<=re;i++)
        {
            ans.add(m[i][cle]);
        }
        cle--;
        if(rs<=re)
        {
            for(int i=cle;i>=cls;i--)
            {
                ans.add(m[re][i]);
            }
            re--;
        }
        if(cls<=cle)
        {
            for(int i=re;i>=rs;i--)
            {
                ans.add(m[i][cls]);
            }
            cls++;
        }
        }
        return ans;
    }
}