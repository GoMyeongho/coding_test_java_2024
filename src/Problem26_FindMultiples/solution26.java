package Problem26_FindMultiples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        List<String> rst =new ArrayList<>() {
        };
        while (true) {
            temp = sc.nextInt();
            if (temp == 0) break;
            if (temp % n ==0 ) rst.add(temp + " is a multiple of " + n);
            else rst.add(temp + " is a NOT multiple of " + n);
        }
        for (String e:rst) System.out.println(e);
    }
}
