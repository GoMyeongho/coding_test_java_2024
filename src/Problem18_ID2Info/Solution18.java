package Problem18_ID2Info;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] id = sc.nextLine().split("-");
        int birth = Integer.parseInt(id[0]);
        int year = birth / 10000;
        int month = birth % 10000 / 100;
        int day = birth % 100;
        int id2 = Integer.parseInt(id[1])/1000000;
        int realYear = 1900 + year + (id2 - 1 )/ 2 * 100;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMdd");
        int nowYear = Integer.parseInt(sdf.format(now));
        int nowDate = Integer.parseInt(sdf2.format(now));
        System.out.printf("생년 월일 : %d년 %d월 %d일\n", realYear, month, day);
        if (id2 % 2 == 0) System.out.println("성별 : 여성");
        else System.out.println("성별 : 남성");
        if (nowDate > month * 100 + day) System.out.println(nowYear - realYear );
        else System.out.println(nowYear - realYear - 1);
    }
}
