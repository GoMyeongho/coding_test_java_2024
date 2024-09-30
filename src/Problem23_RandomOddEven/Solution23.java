package Problem23_RandomOddEven;

import java.util.Random;

public class Solution23 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(1,7);
        int dice2 = random.nextInt(1,7);
        int sum = dice1 + dice2;
        System.out.println(dice1+" "+dice2);
        if (sum % 2 == 0) {
            System.out.println("짝!");
            if (dice1 == dice2) System.out.println("더블!");
        }
        else System.out.println("홀!");
    }
}
