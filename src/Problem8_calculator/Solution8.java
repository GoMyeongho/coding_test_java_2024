package Problem8_calculator;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        int ans = 0;
        switch (s1){
            case "+":
                switch (s2){
                    case "+":
                        ans += n1 + n2 + n3;
                        break;
                    case "-":
                        ans += n1 + n2 - n3;
                        break;
                    case "*":
                        ans += n1 + n2 * n3;
                        break;
                    case "/":
                        ans += n1 + n2 / n3;
                        break;
                    case "%":
                        ans += n1 + n2 % n3;
                        break;
                    default: 
                        System.out.println("잘못된 입력 입니다.");
                        break;
                }
                break;        
            case "-":
                switch (s2){
                    case "+":
                        ans += n1 - n2 + n3;
                        break;
                    case "-":
                        ans += n1 - n2 - n3;
                        break;
                    case "*":
                        ans += n1 - n2 * n3;
                        break;
                    case "/":
                        ans += n1 - n2 / n3;
                        break;
                    case "%":
                        ans += n1 - n2 % n3;
                        break;
                    default:
                        System.out.println("잘못된 입력 입니다.");
                        break;
                }
                break;        
                        
            case "*":
                switch (s2){
                    case "+":
                        ans += n1 * n2 + n3;
                        break;
                    case "-":
                        ans += n1 * n2 - n3;
                        break;
                    case "*":
                        ans += n2 * n1 * n3;
                        break;
                    case "/":
                        ans += n1 * n2 / n3;
                        break;
                    case "%":
                        ans += n1 * n2 % n3;
                        break;
                    default:
                        System.out.println("잘못된 입력 입니다.");
                        break;
                }
                break;
            case "/":
                switch (s2){
                    case "+":
                        ans += n1 / n2 + n3;
                        break;
                    case "-":
                        ans += n1 / n2 - n3;
                        break;
                    case "*":
                        ans += n1 / n2 * n3;
                        break;
                    case "/":
                        ans += n1 / n2 / n3;
                        break;
                    case "%":
                        ans += n1 / n2 % n3;
                        break;
                    default:
                        System.out.println("잘못된 입력 입니다.");
                        break;
                }
                break;
            case "%":
                switch (s2){
                    case "+":
                        ans += n1 % n2 + n3;
                        break;
                    case "-":
                        ans += n1 % n2 - n3;
                        break;
                    case "*":
                        ans += n1 % n2 * n3;
                        break;
                    case "/":
                        ans += n1 % n2 / n3;
                        break;
                    case "%":
                        ans += n1 % n2 % n3;
                        break;
                    default:
                        System.out.println("잘못된 입력 입니다.");
                        break;
                }
                break;
            default:
                System.out.println("잘못된 입력 입니다.");
                break;
        }
        System.out.println(ans);
        
    }
    
}
