class Solution {
    public void setZeroes(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        boolean ra []=new boolean[r];
        boolean ca []=new boolean[c];
        for(int i=0;i<r;i++)   //rowarray make it as true (0)
        {
            for(int j=0;j<c;j++)
            {
                if(m[i][j]==0)
                {
                    ra[i]=true;
                    ca[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            if(ra[i])
            {
                for(int j=0;j<c;j++)
                {
                    m[i][j]=0;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            if(ca[i])
            {
                for(int j=0;j<r;j++)
                {
                    m[j][i]=0;
                }
            }
        }
        
    }
}