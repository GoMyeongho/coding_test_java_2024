package Problem50_BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < n; i++) cards.add(sc.nextInt());
        Collections.sort(cards);
        int sum = 0;
        int temp;
        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++){
                    temp = cards.get(i) + cards.get(j) + cards.get(k);
                    if (temp > m) break;
                    if (temp > sum) sum = temp;
                }
            }
        }
        System.out.println(sum);

    }
}
