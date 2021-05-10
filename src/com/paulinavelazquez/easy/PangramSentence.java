package com.paulinavelazquez.easy;

import java.util.HashSet;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
 * or false otherwise.
 *
 * RESULTS:
 * Runtime: 2 ms, faster than 54.03% of Java online submissions for Check if the Sentence Is Pangram.
 * Memory Usage: 37.1 MB, less than 74.81% of Java online submissions for Check if the Sentence Is Pangram.
 */


public class PangramSentence {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));
    }

    public static boolean isPangram(String sentence) {
        boolean isPangram = false;
        HashSet<Character> list = new HashSet<Character>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            list.add(c);
        }

        isPangram = (list.size() >= 26) ? true : false;
        return isPangram;
    }
}
