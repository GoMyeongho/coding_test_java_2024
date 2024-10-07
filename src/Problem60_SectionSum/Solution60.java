package Problem60_SectionSum;

import java.util.Scanner;

public class Solution60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int i,j, sum = 0;
        for(i = 0; i < n; i++) num[i] = sc.nextInt();
        for(i = 0; i < m; i++){
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();
            for (j = idx1-1; j < idx2; j++) sum += num[j];
            System.out.println(sum);
            sum = 0;
        }
    }
}
