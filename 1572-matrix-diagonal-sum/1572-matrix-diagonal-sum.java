class Solution {
    public int diagonalSum(int[][] mat) {
        int primary=0;
        int secondary =0;
        for(int i=0;i<mat.length;i++)
        {
            primary+=mat[i][i];
            secondary+=mat[i][mat.length-1-i];
        }
        if(mat.length%2!=0)
        {
            return ((primary+secondary)-mat[mat.length/2][mat.length/2]);
        }
        else
        {
            return primary+secondary;
        }
        
    }
}