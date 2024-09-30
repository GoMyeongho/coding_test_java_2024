package Problem27_AlphabetSwap;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String upperWord = word.toUpperCase();
        String lowerWord = word.toLowerCase();
        String wordArranged = "";
        char temp, upperTemp, lowerTemp;
        for (int i = 0; i < word.length(); i++){
            temp = word.charAt(i);
            upperTemp = upperWord.charAt(i);
            lowerTemp = lowerWord.charAt(i);
            if (temp == upperTemp) {
                wordArranged += lowerTemp;
            }
            else {
                wordArranged += upperTemp;
            }
        }
        System.out.println(wordArranged);
    }
}

