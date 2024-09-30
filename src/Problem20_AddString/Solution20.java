package Problem20_AddString;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s : ");
        String s = sc.nextLine();
        System.out.print("k : ");
        String k = sc.nextLine();
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print(s.substring(s.length()-n));
        System.out.println(k);
    }
}
