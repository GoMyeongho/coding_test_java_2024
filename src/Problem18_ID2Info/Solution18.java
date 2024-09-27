package Problem18_ID2Info;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] id = sc.nextLine().split("-");
        int birth = Integer.parseInt(id[0]);
        int gender = Integer.parseInt(id[1])/1000000;
    }
}
