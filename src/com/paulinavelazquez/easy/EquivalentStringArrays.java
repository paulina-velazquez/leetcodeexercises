package com.paulinavelazquez.easy;

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 * RESULTS:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If Two String Arrays are Equivalent.
 * Memory Usage: 36.8 MB, less than 89.39% of Java online submissions for Check If Two String Arrays are Equivalent.
 */

public class EquivalentStringArrays {

    public static void main(String[] args) {

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        for (String s : word1) {
            one.append(s);
        }

        for (String s : word2) {
            two.append(s);
        }

        if (one.toString().equals(two.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
