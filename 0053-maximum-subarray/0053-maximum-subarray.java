class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            current_sum+=nums[i];
            if(current_sum<nums[i])
            {
                current_sum=nums[i];
            }
            if(current_sum>max_sum)
            {
                max_sum=current_sum;
            }
        }
        return max_sum;
    }
}