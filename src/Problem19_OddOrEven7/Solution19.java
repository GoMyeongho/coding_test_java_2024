package Problem19_OddOrEven7;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int[] odd = {};
        int[] even = {};
        System.out.print("짝수 : ");
        for (String e : num) {
            int temp = Integer.parseInt(e);
            if (temp % 2 == 0) System.out.printf("%d ",temp);
        }
        System.out.println();
        System.out.print("홀수 : ");
        for (String e : num) {
            int temp = Integer.parseInt(e);
            if (temp % 2 == 1) System.out.printf("%d ",temp);
        }

    }
}
