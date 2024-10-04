package Problem49_MovieTicket;

import java.util.Scanner;

public class Solution49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket movieTicket = new MovieTicket();
        int n, sel;
        while (true){
            System.out.println("[1]예매하기, [2]종료하기");
            sel = sc.nextInt();
            switch (sel) {
                case 1:
                    n = sc.nextInt();
                    movieTicket.setSeat(n);
                    movieTicket.viewSeat();
                    continue;
                case 2:
                    movieTicket.calcPrice();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }
            break;
        }
    }
}
class MovieTicket {
    int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    final int price = 12000;

    public void setSeat(int idx) {
        if (seat[idx-1] == 0) {
            seat[idx-1] = 1;
            System.out.println(idx + "번 좌석을 예약 했습니다.");
        }
        else System.out.println("이미 예약된 좌석입니다.");
    }
    public void calcPrice() {
        int cnt = 0;
        for (int e : seat) cnt += e;
        System.out.println("총 금액 : " + price * cnt);
    }
    public void viewSeat() {
        for (int e : seat) System.out.print((e == 1) ? "[V]" : "[ ]" );
        System.out.println();
    }


}