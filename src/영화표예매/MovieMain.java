package 영화표예매;
// 예매하기와 종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메서드 작성 ([][][V][][][][][][][])
// 좌석 예약 하기 : 값이 0이면 예약 안된 좌석, 1이면 판매된 좌석
// 총 판매 금액에 대한 메서드 작성

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket 클래스에 대한 객체 생성
        MovieTicket movieTicket = new MovieTicket(12000);
        // 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 메뉴 작성은 무한 반복문으로 구현
        while (true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]취소하기");
            System.out.println("[3]종료하기");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    movieTicket.selectSeat();
                    break;
                case 2:
                    movieTicket.cancelSeat();
                    break;
                case 3:
                    System.out.println(movieTicket.totalAmount());
                    return;
                default:
                    System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }

        }
    }
}
