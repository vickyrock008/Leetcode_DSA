class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int odd=0;
        int[] row = new int[m];
        int[] col = new int [n];
        for(int i=0;i<indices.length;i++)
        {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2!=0)
            {
                odd++;
            }
            }
        }
        return odd;
    }
}