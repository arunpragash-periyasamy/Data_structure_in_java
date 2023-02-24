// 1108 https://leetcode.com/problems/defanging-an-ip-address/
/*
 *eg: 1
 * intput: "1.1.1.1"
 * output: "1[.]1[.]1[.]1"
 *
 * eg: 2
 * intput: "255.100.50.0"
 * output: "255[.]100[.]50[.]0"
 * */

import java.util.Scanner;
public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        System.out.println(defangIPaddr(str));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
