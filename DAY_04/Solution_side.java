package DAY_04;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] a = new boolean[n];
        for (int i = 2; i < n; i++) {
            a[i] = true;
        }

        for (int i = 2; i*i < n; i++) {
            if (a[i]) {
                for (int j = i * i; j < n; j += i) {
                    a[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (a[i]) {
                count++;
            }
        }
        return count;
    }
}

//        int count = 1,count2 = 0;
//        if (n <= 2) {
//        return 0;
//        }
//        for (int i = 3; i < n; i++) {
//        if (i%2 != 0) {
//        for (int j = 2; j < i; j++) {
//        if (i % j == 0) {break;}
//        else {count2++;}
//        }
//        if (count2 == i - 2) {count++;}
//count2 = 0;
//        }
//        }
//        return count;