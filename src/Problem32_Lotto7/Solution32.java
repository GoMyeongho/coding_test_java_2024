package Problem32_Lotto7;

import java.util.HashSet;
import java.util.Random;

public class Solution32 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> lotto = new HashSet<>();
        while (true) {
            lotto.add(random.nextInt(1,51));
            if (lotto.size() == 6) break;
        }
        for (int e : lotto) System.out.print(e + " ");
        System.out.println(random.nextInt(51,101));
    }
}
