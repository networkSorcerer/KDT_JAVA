package 상근이알람;
import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        //  스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 시간 입력 :
        int hour = sc.nextInt();
        // 분 입력 :
        int min = sc.nextInt();
        // 시간과 분을 분으로 환산
        int calc = hour * 60 + min;
        // 계산된 분이 45미만이면 하루의 시간을 더해줌
        if (calc < 45) {
            calc = 24 * 60 + min;
        }
        // 계산된 시간에서 45를 빼줌
        calc -= 45;
        // 다시 시간과 분으로 환산해서 결과 출력
        System.out.printf("%d시 %d분\n", (calc / 60), (calc % 60));
    }
}
