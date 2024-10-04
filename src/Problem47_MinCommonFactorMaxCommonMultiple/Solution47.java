package Problem47_MinCommonFactorMaxCommonMultiple;

import java.util.Scanner;

public class Solution47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xTemp = x;
        int yTemp = y;
        int temp;
        while (yTemp != 0) {
            temp = yTemp;
            yTemp = xTemp % yTemp;
            xTemp = temp;
        }
        System.out.println(xTemp);
        System.out.println(x * y / xTemp);

    }
}
