package Problem25_MeanScore;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            if (temp < 40) temp = 40;
            sum += temp;
        }
        System.out.println(sum/5);
        String test = "123";
        System.out.println(test.charAt(0));
    }

}
