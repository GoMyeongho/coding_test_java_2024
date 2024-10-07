package Problem54_Initials;

import java.util.Scanner;

public class Solution54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = sc.nextLine().split("-");
        String initial = "";
        for (String e : name) initial += e.charAt(0);
        System.out.println(initial);
    }
}
