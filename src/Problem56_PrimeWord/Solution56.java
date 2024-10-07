package Problem56_PrimeWord;

import java.util.HashSet;
import java.util.Scanner;

public class Solution56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum = 0;
        char temp;
        for (int i = 0; i < word.length(); i++) {
            temp =word.charAt(i);
            if ( temp < 'a') temp -= ('A' - 26);
            else temp -= 'a';
            temp++;
            sum += temp;
        }
        boolean isPrime = true;
        HashSet<Integer> prime = new HashSet<>(2);
        for (int i = 3; i < sum / 2; i++) {
            for (int e : prime) {
                if (i % e == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) prime.add(i);
            isPrime = true;
        }
        for (int e : prime) {
            if (sum % e == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
