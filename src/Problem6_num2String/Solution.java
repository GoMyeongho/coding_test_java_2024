package Problem6_num2String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String[] areas = {"","서울","경기","인천","수원"};
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]서울, [2]경기, [3]인천, [4]수원");
        System.out.print("지역을 입력 : ");
        int area = sc.nextInt();
        System.out.println(areas[area]);
    }
}
