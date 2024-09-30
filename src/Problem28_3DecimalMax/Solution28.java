package Problem28_3DecimalMax;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxNum = n % 10;
        if (maxNum < n / 100) maxNum = n / 100;
        if (maxNum < n % 100 / 10) maxNum = n % 100 / 10;
        System.out.println(maxNum);

    }
}
