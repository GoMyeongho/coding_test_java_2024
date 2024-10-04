package Problem51_OctalBinary;

import java.util.Scanner;

public class Solution51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        String binary = "";
        int temp;
        for (int i = 0; i < octal.length(); i++) {
            temp = octal.charAt(i) - '0';
            binary += String.valueOf(temp / 4);
            binary += String.valueOf(temp % 4 / 2);
            binary += String.valueOf(temp % 2);
        }
        System.out.println(Integer.parseInt(binary));
    }


}
