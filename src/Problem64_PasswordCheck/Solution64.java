package Problem64_PasswordCheck;

import java.util.Scanner;

public class Solution64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.length() > 30 || password.length() < 10 ) System.exit(1);
        boolean isSpeChr = false, isNum = false;
        if (!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase())) {
            for (int i = 0; i < password.length(); i++) {
                switch (password.charAt(i)) {
                    case '!', '%', '_', '#', '&', '+', '-', '*', '/' :
                        isSpeChr = true;
                    case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                        isNum = true;
                }
            }
        }
        if (isSpeChr && isNum) System.out.println("Good password!");
        else System.out.println("Bad password!");

    }
}
