class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
         int result = 0;
        for(int i=0;i<accounts.length;i++)
        {
           sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                 sum = sum +accounts[i][j];
            }
            if(sum>result)
            {
                result=sum;
            }
            
        }
       return result;
        
    }
}