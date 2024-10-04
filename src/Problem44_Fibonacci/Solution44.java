package Problem44_Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> fibo = new ArrayList<>(List.of(1,1));
        for (int i = 2; i < n; i++) fibo.add(fibo.get(i-1) + fibo.get(i - 2));
        System.out.println(fibo.get(n-1));
        // 1 1 2 3 5 8 13 21 34 55
    }
}
