package Problem39_PrimeSum;

import java.util.HashSet;
import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> prime = new HashSet<>();
        prime.add(2);
        int sum = 0;
        boolean isPrime;
        for (int i = 3; i < n; i++) {
            isPrime =true;
            for (int e : prime) {
                if (i % e == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) prime.add(i);
        }
        for (int e : prime) sum += e;
        System.out.println(sum);
    }
}
