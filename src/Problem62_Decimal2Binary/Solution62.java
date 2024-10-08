package Problem62_Decimal2Binary;

import java.util.Scanner;

public class Solution62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int binary = dec2Bin(decimal);
        int decimal2 = bin2Dec(binary);
        System.out.println(binary);
        System.out.println(decimal2);


    }
    static int dec2Bin(int decimal) {
        int temp;
        int length = (int) (Math.log(decimal) / Math.log(2));
        String bin = "";
        for (int i = length; i >= 0; i--){
            temp = (int) (decimal / Math.pow(2,i));
            decimal %= (int) Math.pow(2,i);
            bin += String.valueOf(temp);
        }
        return Integer.parseInt(bin);
    }
    static int bin2Dec(int binary) {
        String bin = String.valueOf(binary);
        int dec = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                dec += (int) Math.pow(2, bin.length() - 1 - i);
            }
        }
        return dec;
    }
}

