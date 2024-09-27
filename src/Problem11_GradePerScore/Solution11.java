package Problem11_GradePerScore;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다.");
        }
        else{
            int scoreArea = score / 10;
            switch (scoreArea){
                case 10, 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");
                    break;
            }
        }
    }
}
