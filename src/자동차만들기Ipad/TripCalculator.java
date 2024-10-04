package 자동차만들기Ipad;

import java.text.NumberFormat;

public class TripCalculator {
    public static String roundTripCount(int carType, int[] seat, int passengers, int option) {
        NumberFormat numberFormat = NumberFormat.getInstance(); // 숫자 형식 포맷터
        int seats = seat[carType]; // 선택한 차량의 좌석 수
        int passenger = passengers; // 승객 수
        int roundTripCount = 0; // 왕복 횟수 변수 초기화

        switch (carType) {
            case 1:
                // 스포츠카
                roundTripCount = (int) Math.ceil((double) passenger / seats);
                break;

            case 2:
                // 승용차
                if (option == 1) {
                    seats += 1; // 트렁크를 좌석으로 추가한 경우
                }
                roundTripCount = (int) Math.ceil((double) passenger / seats);
                break;

            case 3:
                // 버스
                roundTripCount = (int) Math.ceil((double) passenger / seats);
                break;

            default:
                System.out.println("Invalid car type.");
                return "0";
        }

        return numberFormat.format(roundTripCount);
    }
}
