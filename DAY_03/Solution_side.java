package DAY_03;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() ; i > 0 ; i--) {
            if (s.charAt(i-1) != ' ') {
                count++;
            } else if (count > 0 && s.charAt(i-1) == ' ') {
                break;
            }
        }
        return count;
    }
}