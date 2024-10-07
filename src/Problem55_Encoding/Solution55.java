package Problem55_Encoding;

import java.util.Scanner;

public class Solution55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        String key = sc.next();
        int cnt = 0;
        String encode = "";
        int temp;
        char tempChr;
        for (int i = 0; i < code.length(); i++) {
            if (cnt == 4) cnt = 0;
            if (code.charAt(i) == ' ') {
                encode += ' ';
                cnt++;
                continue;
            }
            temp = (code.charAt(i) - key.charAt(cnt++) - 1);
            if (temp <= 0) temp += 26;
            tempChr = (char) (temp + 'a');
            encode += tempChr;

        }
        System.out.println(encode);
    }
}
