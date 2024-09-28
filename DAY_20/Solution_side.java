package DAY_20;

import java.util.ArrayList;

class Solution {
    public void rotate(int[] a, int target) {
        target = target % a.length;
        boolean b = a.length == 1 || a.length == 0 || target == 0;
        if (b) {
            a = a;
        }
        else {
            ArrayList<Integer> a1 = new ArrayList<>();
            for (int i = a.length - target; i < a.length; i++) {
                a1.add(a[i]);
            }
            for (int i = 0; i < a.length - target; i++) {
                a1.add(a[i]);
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = a1.get(i);
            }
        }
    }
}
