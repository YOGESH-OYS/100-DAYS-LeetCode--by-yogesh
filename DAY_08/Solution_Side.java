package DAY_08;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[j]) {
                count++;
            } else if (count == 0) {
                return a[i-1];
            }else {
                count = 0;
            }
            j++;
        }
        return a[a.length-1];
    }
}
