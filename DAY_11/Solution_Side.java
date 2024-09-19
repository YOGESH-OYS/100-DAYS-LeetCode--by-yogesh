package DAY_11;

class Solution {
    public String longestPalindrome(String a) {
        int max = 0;int s_i  = 0 ,s_o = 0;int len = a.length();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();
        StringBuilder f = new StringBuilder();

        if (new StringBuilder(a).reverse().toString().equals(a)) {
            return a;
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 1; j < a.length(); j++) {

                if (a.charAt(i) == a.charAt(j)) {
                    for (int k = i; k <= j; k++) {
                        b.append(a.charAt(k));
                    }
                    if (d.length() == len && d.length() > max) {
                        return String.valueOf(d);
                    }
                    d.append(b);
                    c.append(b.reverse());
                    if (c.toString().contentEquals(d)) {
                        if (b.length() > max) {
                            s_i = i;
                            s_o = j;
                            max = b.length();
                        }
                    }
                    b.delete(0,b.length());
                    c.delete(0,c.length());
                    d.delete(0,d.length());
                }
            }
            len--;
        }
        for (int i = s_i; i <= s_o ; i++) {
            d.append(a.charAt(i));
        }
        return String.valueOf(d);
    }
}

//optimized

class Solutio {
    public String longestPalindrome(String a) {
        int max = 0, s_i = 0, s_o = 0;
        int len = a.length();


        if (new StringBuilder(a).reverse().toString().equals(a)) {
            return a;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    boolean isPalindrome = true;

                    for (int k = i, l = j; k < l; k++, l--) {
                        if (a.charAt(k) != a.charAt(l)) {
                            isPalindrome = false;
                            break;
                        }
                    }

                    if (isPalindrome && (j - i + 1) > max) {
                        s_i = i;
                        s_o = j;
                        max = j - i + 1;
                    }
                }
            }
        }
        return a.substring(s_i, s_o + 1);
    }
}


