package DAY_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Solution {
    public int longestConsecutive(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        ArrayList<Integer> aa = new ArrayList<>();
        for (int j : a) {
            aa.add(j);
        }
        Collections.sort(aa);
        duplicates(aa);
        for (int i = 0 ; i < aa.size() ; i++) {
            a[i] = aa.get(i);
        }

        int count = 0;int max = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]-a[i+1] == -1) {
                count++;
                if (max < count) {
                    max = count;
                }
            }
            else { count = 0; }
        }
        return max+1;
    }
    public static void duplicates (ArrayList<Integer> a){
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < a.size()-1; i++) {
            if (Objects.equals(a.get(i), a.get(i + 1))) {
                continue;
            }
            else {
                s.add(a.get(i));
            }
        }
        s.add(a.get(a.size()-1));
        a.clear();
        a.addAll(s);
    }
}
