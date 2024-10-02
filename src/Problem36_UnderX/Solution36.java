package Problem36_UnderX;

import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if ( temp < x ) System.out.print(temp + " ");
        }
    }
}
