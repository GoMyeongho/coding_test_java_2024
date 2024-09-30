package Problem21_RepeatedArray;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,1,2,6,1,3};
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == n) cnt++;
            if (cnt == 2) {
                System.out.println(i + 1);
                break;
            }
        }


    }
}
