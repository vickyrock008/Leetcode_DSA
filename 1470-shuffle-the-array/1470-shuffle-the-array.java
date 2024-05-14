class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp=0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length/2;i++)
        {
            res[temp] = nums[i];
            res[temp+1] = nums[n];
            temp=temp+2;
            n++;
        }
        return res;
    }
}