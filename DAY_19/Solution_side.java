package DAY_19;

class Solution {
    public int[] searchRange(int[] a, int tar) {
        int[] ans = new int[2];
        int[] ans2 = new int[2];
        ans2[0] = -1;ans2[1] = -1;
        if (a.length == 0) {
            return ans2;
        }
        int i = 0;int start, end ;
        while (true){
            if (i >= a.length) {
                break;
            }
            if (a[i] == tar) {
                start = i;
                end = i;
                for (int j = i+1 ; j < a.length; j++) {
                    if (a[j] == tar){
                        end = j;
                    }
                }
                ans[0] = start;ans[1] = end;
                return ans;
            }
            i++;
        }
        return ans2;
    }
}
