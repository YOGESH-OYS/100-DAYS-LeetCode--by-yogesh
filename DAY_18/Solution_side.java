package DAY_18;

import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert numbers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort strings using a custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Edge case - if the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Step 4: Concatenate the sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String str : strNums) {
            largestNumber.append(str);
        }

        // Step 5: Return the result
        return largestNumber.toString();
    }
}
