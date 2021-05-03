package com.paulinavelazquez.easy;

/**
 * 1 <= s.length <= 1000
 * s[i] is either 'L' or 'R'.
 * s is a balanced string.
 */

public class SplitAStringInBalance {

    public static void main(String[] args) {

        System.out.println("\n" + balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }

    public static int balancedStringSplit(String s) {
        int counter = 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            counter += s.charAt(i) == 'R'? 1 : -1;
            if(counter == 0)
                res++;
        }
        return res;
    }
}
