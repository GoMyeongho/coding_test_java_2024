package Problem15_Alarm;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        hour = (hour - 1 + min / 45);
        if(hour < 0) hour += 24;
        min = (min + 15) % 60;
        System.out.println(hour + ":" + min);
    }
}
