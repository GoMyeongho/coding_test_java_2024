package Problem53_MicrowaveOven;

import java.util.Scanner;

public class Solution53 {
    public static void main(String[] args) {
        final int timeA = 30, timeB = 6, timeC = 1;
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        if (t % 10 == 0) {
            t /= 10;
            System.out.print(t/timeA + " ");
            t %= timeA;
            System.out.print(t/timeB + " ");
            t %= timeB;
            System.out.print(t/timeC + " ");
        }
        else System.out.println(-1);
    }
}
