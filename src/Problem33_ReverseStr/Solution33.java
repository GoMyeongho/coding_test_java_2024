package Problem33_ReverseStr;

import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String reverseStr = "";
        for (int i = string.length() - 1; i >= 0; i-- ) {
            reverseStr += string.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
