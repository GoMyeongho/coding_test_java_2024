package Problem42_ArrangedScore;

import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        int temp;
        String tempStr;
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (score[i] > score[j]) {
                    temp = score[i];
                    tempStr = name[i];
                    score[i] = score[j];
                    name[i] = name[j];
                    score[j] = temp;
                    name[j] = tempStr;
                }
            }
        }
        for (String e : name) System.out.print(e + " ");
    }
}
