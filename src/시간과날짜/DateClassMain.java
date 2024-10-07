package 시간과날짜;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClassMain {
    public static void main(String[] args) {
        Date now = new Date(); // 현재 시간을 나타내는 Date 객체 생성
        DateFunc(); // Date 클래스 사용 예시
        calendarFunc(); // Calendar 클래스 사용 예시

        // Date 객체의 기본 toString() 메서드 사용
        String strNow1 = now.toString();
        System.out.println(strNow1);

        // SimpleDateFormat 사용하여 Date 객체를 원하는 형식으로 출력
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

        // 다양한 포맷으로 날짜 출력
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));
    }

    // Date 클래스 예제 함수
    static void DateFunc() {
        Date now = new Date(); // 현재 시간을 나타내는 Date 객체 생성
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));
    }

    // Calendar 클래스 예제 함수
    static void calendarFunc() {
        // Calendar 객체 생성 및 초기화
        Calendar cal = Calendar.getInstance();

        // Calendar 객체의 각 필드를 출력
        System.out.println("년도: " + cal.get(Calendar.YEAR)); // 현재 년도
        System.out.println("월: " + (cal.get(Calendar.MONTH) + 1)); // 현재 월 (0부터 시작하므로 +1)
        System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH)); // 현재 일
        System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); // 현재 요일 (1: 일요일, 2: 월요일, ...)
        System.out.println("오전/오후: " + (cal.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후")); // 오전/오후 여부
        System.out.println("시(12시간제): " + cal.get(Calendar.HOUR)); // 시 (12시간제)
        System.out.println("분: " + cal.get(Calendar.MINUTE)); // 분
        System.out.println("초: " + cal.get(Calendar.SECOND)); // 초
    }
}
