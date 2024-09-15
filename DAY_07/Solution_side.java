package DAY_07;

import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] a) {
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] == a[i]) {
                return a[i];
            }
        }
        return 0;
    }
}
