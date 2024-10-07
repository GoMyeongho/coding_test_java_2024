package Problem59_PlusCycle;

import java.util.Scanner;

public class Solution59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = nextNum(num) , cnt = 1;
        while (num != temp){
            temp = nextNum(temp);
            cnt++;
        }
        System.out.println(cnt);

    }
    static int nextNum(int num){
        if (num < 10) return num * 11;
        int sum = num % 10 + num / 10;
        return num % 10 * 10 + sum % 10;

    }
}
