package Problem63_StockAnalysis;

import java.util.Scanner;

public class Solution63 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        for ( int i = 0; i < n; i++) {
            int[] stocks = strArr2intArr();
            System.out.println(numMidPoint(stocks));
        }

    }
    static int numMidPoint(int[] stocks){
        boolean isIncrease= false;
        int cnt= 0;
        for (int i = 1; i < stocks.length; i++){
            if (stocks[i] > stocks[i-1]) isIncrease = true;
            if (isIncrease && stocks[i] < stocks[i-1]){
                isIncrease = false;
                cnt++;
            }

        }
        return cnt;
    }
    static int[] strArr2intArr() {
        String[] num = sc.nextLine().split(" ");
        int[] stocks = new int[num.length];
        for (int i = 0; i < num.length; i++) stocks[i] = Integer.parseInt(num[i]);
        return stocks;
    }
}
