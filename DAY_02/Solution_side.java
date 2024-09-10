package DAY_02;

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
       try {
           int num = Integer.parseInt(num1);
           int num3 = Integer.parseInt(num2);
           long a =(long) num*num3;
           System.out.println(a);
           return String.valueOf(Integer.parseInt(String.valueOf(a)));
       } catch (NumberFormatException e) {
           try {
               BigInteger a = new BigInteger(num1);
               BigInteger b = new BigInteger(num2);
               BigInteger c = a.multiply(b);
               return String.valueOf(c);
           } catch (Exception exception) {
               throw new RuntimeException(exception);
           }
       }
    }
}
