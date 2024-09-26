package Problem2_timeReform;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        String[] noon = {"오전", "오후"};
        int noon_num = 0;
        int hour = Integer.valueOf(time[0]);

        if (hour > 11) {
            hour -= 12;
            noon_num++;
        }
        for (int i = 1; i < 3; i++) {
            if (time[i].length() == 1) {
                time[i] = "0" + time[i];
            }
        }
        System.out.println(noon[noon_num] + hour + "시" + time[1] + "분" + time[2]+ "초");
    }
}
