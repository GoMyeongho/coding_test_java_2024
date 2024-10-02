package Problem38_Resistance;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        final List<String> COLORS = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        String c;
        for (int i = 0; i < 3; i++){
            c = sc.nextLine();
            n[i] = COLORS.indexOf(c);
        }
        long rst = (long) ((n[0] * 10 + n[1]) * Math.pow(10, n[2]));
        System.out.println(rst);
    }
}

