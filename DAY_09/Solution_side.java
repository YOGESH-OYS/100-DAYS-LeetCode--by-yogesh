package DAY_09;

class Solution {
    public int maxScore(int[] a, int s) {
        int sum ,result = 0 ,h = a.length - s ,z = 0 ,d ,com = 0;
        for (int i = 0; i < s; i++) {
            z += a[i];
            d = 0;
            sum = 0;
            for (int j = a.length-1 ; j > h ; j--) {
                d += a[j];
            }
            sum += z + d;h++;
            if (sum > result) {
                result = sum;
            }
        }
        for (int i = a.length-1; i >= a.length - s ; i--) {
            com += a[i];
        }
        if (com > result) {
            result = com;
        }
        return result;
    }
}
