// Time Complexity : O(N)
// Space Complexity : O(N)
// Passed Leetcode

class Solution {
    
    int[] nums;
    int[] dp;
    
    public boolean jump(int index) {
        
        
        if (index == nums.length - 1)
            return true;
        
        if (index >= nums.length || nums[index] == 0 || dp[index] == 1)
            return false;
        
        for (int i = nums[index]; i > 0; i--) {
            
            if (jump(index + i))
                return true;
        }
        
        dp[index] = 1;
        
        return false;
        
    }
    
    public boolean canJump(int[] nums) {
        this.nums = nums;
        dp = new int[nums.length];
        return jump(0);
        
    }
}