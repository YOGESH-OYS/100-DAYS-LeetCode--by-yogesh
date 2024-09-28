package DAY_20;

import java.util.Arrays;

public class Main_page {
    public static void main(String[] args) {
        int[] a = {1,9};
        int target = 3;
        Solution l = new Solution();
        l.rotate(a,target);
        System.out.println(Arrays.toString(a));
    }
}
