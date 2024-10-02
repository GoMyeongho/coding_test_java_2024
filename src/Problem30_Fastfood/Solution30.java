package Problem30_Fastfood;

import java.util.Scanner;

public class Solution30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger = sc.nextInt();
        int temp;
        for (int i = 0; i < 2; i++) {
            temp = sc.nextInt();
            if(temp < burger) burger = temp;
        }
        int drink = sc.nextInt();
        temp = sc.nextInt();
        if(temp < drink) drink = temp;
        System.out.println(burger + drink - 50);
    }
}
