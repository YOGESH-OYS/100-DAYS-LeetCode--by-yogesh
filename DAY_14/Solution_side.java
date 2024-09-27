package DAY_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate values for 'i'

            int left = i + 1; // Start of the second element
            int right = nums.length - 1; // End of the third element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicate values for 'left' and 'right'
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++; // Increase sum by moving left pointer right
                } else {
                    right--; // Decrease sum by moving right pointer left
                }
            }
        }
        return result;
    }
}


//THIS CODE IS IMPROVISED VERSION