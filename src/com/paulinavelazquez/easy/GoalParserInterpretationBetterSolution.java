package com.paulinavelazquez.easy;

public class GoalParserInterpretationBetterSolution {

    public static void main(String[] args) {

        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        String str = "";
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);
            if(c == 'G'){
                str += "G";
            } else if(c == '('){
                if(command.charAt(i+1) == ')'){
                    str += "o";
                    i++;
                } else {
                    str += "al";
                    i += 3;
                }
            }
        }
        return str;
    }
}
