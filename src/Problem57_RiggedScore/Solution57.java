package Problem57_RiggedScore;

import java.util.Scanner;

public class Solution57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0,sum = 0, i, temp ;
        for (i = 0; i < n; i++){
            temp = sc.nextInt();
            if (max < temp) max = temp;
            sum += temp;
        }
        double mean = (double) sum / n;
        System.out.println(mean / max * 100);
    }
}
