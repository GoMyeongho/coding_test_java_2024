package Problem29_SumOfNumbers;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String numStr = sc.nextLine();
        int sum = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = numStr.charAt(i) - '0';
            sum += temp;
        }
        System.out.println(sum);
    }
}
