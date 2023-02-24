// 1678 https://leetcode.com/problems/goal-parser-interpretation/
/*
* Input: command = "G()(al)"
* Output: "Goal"
* Input: command = "G()()()()(al)"
* Output: "Gooooal"
* Input: command = "(al)G(al)()()G"
* Output: "alGalooG"
* */

import java.util.Scanner;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}
