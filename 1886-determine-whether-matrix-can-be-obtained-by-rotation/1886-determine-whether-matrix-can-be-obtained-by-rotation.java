class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int r90 =0 ;
        int r180 =0 ;
        int r270 =0 ;
        int r0 =0 ;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]==target[mat.length-j-1][i])
                {
                   r90++;
                }
                if(mat[i][j]==target[mat.length-i-1][mat.length-j-1])
                {
                   r180++;
                }
                if(mat[i][j]==target[j][mat.length-i-1])
                {
                   r270++;
                }
                if(mat[i][j]==target[i][j])
                {
                   r0++;
                }
                
            }
        }
        if(r90 ==  mat.length*mat.length || r270 ==  mat.length*mat.length || r180 ==  mat.length*mat.length || r0 ==  mat.length*mat.length)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
}