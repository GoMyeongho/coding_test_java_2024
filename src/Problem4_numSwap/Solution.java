package Problem4_numSwap;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println(n1);
        System.out.println(n2);
    }
}
