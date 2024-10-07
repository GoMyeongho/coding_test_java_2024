package Problem52_WordStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();
        int[] wordNum = new int[26];
        Arrays.fill(wordNum,0);
        int temp;
        for (int i =0; i < word.length(); i++) {
            temp = (int) (word.charAt(i) - 'A');
            wordNum[temp]++;
        }
        int idx = 0;
        int max = 0;
        boolean repeat = false;
        for (int i = 0; i < 26; i++) {
            temp = wordNum[i];
            if (max < temp) {
                repeat = false;
                max = temp;
                idx = i;
            }
            else if (max == temp) {
                repeat = true;
            }
        }
        char chr = (char)('A' + idx);
        if (repeat) System.out.println(-1);
        else System.out.println(chr);


    }
}
