package Problem46_EuclidAlgorithm;

import java.util.Scanner;

public class Solution46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(x);
    }
}
