package Problem1_sum_of_nums;

import java.util.Scanner;

public class solution {
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
