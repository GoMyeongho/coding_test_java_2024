package Problem22_IsPrimeNum;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt;
        HashSet<Integer> prime = new HashSet<>(List.of(2));
        for (int i = 3; i < n / 2; i+=2) {
            cnt = 0;
            for (int e : prime){
                if (i % e == 0) cnt += 1;
            }
            if (cnt == 0) prime.add(i);
        }
        cnt = 0;
        for (int e : prime) {
            if (n % e == 0) {
                System.out.println(n + " is NOT prime number");
                cnt++;
                break;
            }
        }
        if (cnt == 0) System.out.println(n + " is prime number");
    }
}
