package Problem34_Remainder;

import java.util.HashSet;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            remainders.add(sc.nextInt() % 42);
        }
        System.out.println(remainders.size());
    }
}
