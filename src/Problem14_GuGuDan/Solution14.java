package Problem14_GuGuDan;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i =1; i < 10; i++ ) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }
    }
}
