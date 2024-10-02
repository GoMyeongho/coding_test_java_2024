package Problem31_CompareStr;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        while (str1.length() != str2.length()){
            if (str1.length() > str2.length()) {
                str2 += " ";
            }
            else str1 += " ";
        }
        int cnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                System.out.print(str1.charAt(i));
                cnt++;
            }
        }
        System.out.println();
        if (cnt == 0) System.out.println("No CS");
        System.out.println(cnt);
    }
}
