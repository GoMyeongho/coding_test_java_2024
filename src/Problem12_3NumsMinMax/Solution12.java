package Problem12_3NumsMinMax;


import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = min;
        for (int i = 1; i < 3; i++){
            int temp = sc.nextInt();
            if (temp >= max) max = temp;
            if (temp <= min) min = temp;
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);

    }
}
