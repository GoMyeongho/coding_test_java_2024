package Problem9_7thMultiples;

public class Solution9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
                System.out.printf("%4d",i);
                count++;
            }
        }
    }
}
