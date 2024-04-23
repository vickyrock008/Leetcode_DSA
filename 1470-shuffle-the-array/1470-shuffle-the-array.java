class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[2*n];
        int k=0;
        for(int i=0;i<2*n;i=i+2)
        {
            temp[i] = nums[k];
           temp[i+1]=nums[n+k];
           k++; 
        }
        return temp;
    }
}