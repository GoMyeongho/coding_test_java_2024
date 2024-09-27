package Problem17_Lotto;

import java.util.HashSet;
import java.util.Random;

public class Solution17 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (true) {
            set.add(random.nextInt(45)+1);
            if (set.size() == 6) break;
        }
        for (int e : set) System.out.print(e + "  ");
    }
}
