package DAY_05;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i+1 ; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int  t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
