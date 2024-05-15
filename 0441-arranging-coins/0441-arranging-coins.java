class Solution {
    public int arrangeCoins(int n) {
        double ans = Math.sqrt(2*(long)n+0.25)-0.5;
        return (int)ans;
    }
}