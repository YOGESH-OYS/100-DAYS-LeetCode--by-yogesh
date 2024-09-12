package DAY_04;

class Solution {
    public int countPrimes(int n) {
        int count = 1,count2 = 0;
        if (n <= 2) {
            return 0;
        }
        for (int i = 3; i < n; i++) {
            if (i%2 != 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {break;}
                    else {count2++;}
                }
                if (count2 == i - 2) {count++;}
                count2 = 0;
            }
        }
        return count;
    }
}