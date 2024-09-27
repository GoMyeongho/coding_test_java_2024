package Problem16_NMinMax;

import java.util.Scanner;

public class solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        for (int i = 1; i < num; i++) {
            int temp = sc.nextInt();
            if (temp >= max) max = temp;
            if (temp <= min) min = temp;
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
