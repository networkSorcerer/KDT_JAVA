package 영화표예매;
import java.util.Scanner;

public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성
    private final int[] seat = new int[10];
    // 좌석당 가격에 대한 인스턴스 필드
    private final int price;
    // 입력을 받기 위한 스캐너 객체 생성
    private final Scanner sc = new Scanner(System.in);

    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 되므로 매개변수가 있는 생성자 필요
    public MovieTicket(int price) {
        this.price = price;
    }

    // 좌석 상태 표시 메서드 구현
    public void printSeat() {
        for (int e : seat) {
            if (e == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();
    }
    // 좌석 예약 메서드 구현
    public void selectSeat() {
        printSeat();
        System.out.print("좌석 번호를 입력 하세요 : ");
        int seatPos = sc.nextInt();
        if (seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1;
            System.out.println("좌석이 예매 되었습니다.");
            printSeat();
        } else {
            System.out.println("이미 예약된 좌석 입니다.");
        }
    }

    // 예약 취소 하기 구현
    public void cancelSeat() {
        printSeat();
        System.out.print("취소할 좌석을 입력 하세요 : ");
        int seatPos = sc.nextInt();
        if (seat[seatPos - 1] == 1) {
            seat[seatPos - 1] = 0;
            System.out.println("좌석 예약이 취소 되었습니다.");
            printSeat();
        } else {
            System.out.println("예약된 좌석이 아닙니다.");
        }
    }

    // 총 판매 금액 메서드 구현 (총 판매 금액은 인스턴스 필드로 만들지 말고 결과로 반환)
    public int totalAmount() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * price;
    }
}
