package Problem45_ProportionalExpression;

import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rodHeight = sc.nextDouble();
        double rodShadow = sc.nextDouble();
        double distance = sc.nextDouble();
        double pyramidHeight = distance * rodHeight / rodShadow + rodHeight;
        System.out.println(pyramidHeight);
    }
}
