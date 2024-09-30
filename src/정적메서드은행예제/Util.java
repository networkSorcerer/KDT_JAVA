package 정적메서드은행예제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    // 두 수의 최대값을 반환 하는 메서드
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    // 홀 수 짝 수 판별하기
    public static boolean isEven(int number) {
        return number % 2 ==0;
    }
    // 문자열을 입력 받아 시간 정보 출력
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}
