package com.paulinavelazquez.easy;

public class RemoveVowelsFromStringSolution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "leetcodeisacommunityforcoders";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}

