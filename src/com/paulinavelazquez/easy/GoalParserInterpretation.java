package com.paulinavelazquez.easy;

public class GoalParserInterpretation {

    public static void main(String[] args) {

        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        String str = "";
        boolean isL = false;

        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G') {
                str += 'G';
            } else if (c == '(') {
            } else if ((c == ')') && (isL)) {
                isL = false;
                continue;
            }
            else if (c == ')') {
                str += 'o';
            } else if (c == 'a'){
                str += 'a';
            } else if (c == 'l') {
                str+= 'l';
                isL = true;
            } else {
                break;
            }
        }
        return str;
    }
}
