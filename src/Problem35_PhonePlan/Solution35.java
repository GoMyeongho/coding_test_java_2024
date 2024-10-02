package Problem35_PhonePlan;

import java.util.Scanner;

public class Solution35 {

    public static int yPlan(int time) {
        return 10 * (time / 30) + 10;
    }
    public static int mPlan(int time) {
        return 15 * (time / 60) + 15;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int yPay = 0, mPay = 0, time;
        for (int i = 0; i < n; i++) {
            time = sc.nextInt();
            yPay += yPlan(time);
            mPay += mPlan(time);
        }
        if (mPay > yPay) System.out.println("Y " + yPay);
        else if (mPay < yPay) System.out.println("M " + mPay);
        else System.out.println("YM " + mPay);
    }
}
