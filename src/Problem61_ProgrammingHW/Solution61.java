package Problem61_ProgrammingHW;

import java.util.Scanner;

public class Solution61 {
    public static void main(String[] args) {
        final double sumDecimalize = 0.123456789;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i % 2 ==1 && j < n-1) System.out.printf(" ");
                else System.out.printf("%c",'A'+i);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < Math.pow(2,i); j++){
                System.out.printf("%c",'A'+ (i + j) % 26);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i > j) System.out.printf("%c",'C');
                else if (i < j) System.out.printf("%c",'B');
                else System.out.printf("%c",'A');
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        for (int i = 0; i < n; i++){
            System.out.printf(" ");
            for (int j = 0; j < i+1; j++){
                System.out.printf("%c", j+'1');
            }
            System.out.printf(" ");
            System.out.printf("%c",'+'+ i / (n-1) * 18);
            sum += (int) (sumDecimalize * Math.pow(10,i+1));
        }
        System.out.printf(" %d",sum);

    }
}
// 1 13  136  1370