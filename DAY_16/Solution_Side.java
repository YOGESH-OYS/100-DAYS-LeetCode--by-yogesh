package DAY_16;

class Solution {
    public boolean isPalindrome(String haystack) {
        haystack = haystack.toLowerCase();
        StringBuilder d = new StringBuilder();
        for (int i = 0; i < haystack.length() ; i++) {
            if (Character.isLetterOrDigit(haystack.charAt(i))) {
                d.append(haystack.charAt(i));
            }
        }
        StringBuilder d0 = new StringBuilder(d);
        if (d0.toString().contentEquals(d.reverse())) {
            return true;
        }
        else {
            return false;
        }
    }
}
