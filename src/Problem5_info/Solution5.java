package Problem5_info;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 : ");
        String name = sc.nextLine();
        System.out.print("주소를 입력 : ");
        String addr = sc.nextLine();
        System.out.print("전화번호를 입력 : ");
        String phone = sc.nextLine();
        System.out.print("성별을 입력 : ");
        String gender = sc.nextLine();
        System.out.println("===================");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("전화번호 : " + phone);
        System.out.println("성별 : " + gender);
    }
}
