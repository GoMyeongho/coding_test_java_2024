package Problem48_PCCafePartTime;

import java.util.Arrays;
import java.util.Scanner;

public class Solution48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seat = new boolean[100];
        Arrays.fill(seat,true);
        int n = sc.nextInt();
        int cnt = 0;
        int seatNum;
        for (int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if (seat[seatNum]) seat[seatNum] = false;
            else cnt++;
        }
        System.out.println(cnt);
    }
}
