package Problem1_sumOfNums;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
