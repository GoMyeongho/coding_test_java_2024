package Problem58_Sort2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int e : num) System.out.println(e);
    }
}
