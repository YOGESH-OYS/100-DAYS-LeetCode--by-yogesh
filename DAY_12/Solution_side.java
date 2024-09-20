package DAY_12;

class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder l = new StringBuilder();
        StringBuilder m = new StringBuilder();
        outer:
        for (char i = 'a'; i <= 'z' ; i++) {
            for (int j = 0; j < t.length(); j++) {
                if (i == t.charAt(j)) {
                    l.append(t.charAt(j));
                }
                if (l.length() == t.length()) {
                    break outer;
                }
            }
        }
        out:
        for (char i = 'a'; i <= 'z' ; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == s.charAt(j)) {
                    m.append(s.charAt(j));
                }
                if (m.length() == s.length()) {
                    break out;
                }
            }
        }
        if (m.toString().contentEquals(l)) {
            return true;
        }
        return false;
    }
}
