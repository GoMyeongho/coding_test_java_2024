package Problem43_Pythagoras;


import java.util.Arrays;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] length = new int[3];
        while (true) {
            for(int i = 0; i < 3; i++) length[i] =  sc.nextInt();
            if (length[0] == 0 && length[1] == 0 && length[2] == 0 ) break;
            Arrays.sort(length);
            int a = length[0], b = length[1], c = length[2];
            if ( c* c == a * a + b * b) System.out.println("right");
            else System.out.println("wrong");

        }
    }
}
