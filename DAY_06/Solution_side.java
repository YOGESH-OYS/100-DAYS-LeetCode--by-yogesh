package DAY_06;

class Solution {
    public int findPeakElement(int[] nums) {
        int result = 0,max = 0;
        if(nums.length == 1){ return result;}
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                max = i;
            }
        }
        return max;
    }
}
