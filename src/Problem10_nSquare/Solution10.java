package Problem10_nSquare;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n * n; i++){
            System.out.printf("%4d ", count);
            if (count % n == 0) System.out.println();
            count++;

        }

    }
}
