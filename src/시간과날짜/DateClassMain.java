package 시간과날짜;
// Date 클래스 : 자바 초기 버전 부터 제공되는 클래스
// java.util 패키지에 포함되어 있음
// Date 객체는 UTC(협정 시계시)를 기준으로 1970년 1월 1일 자정부터
// 경과시간 계산 (밀리초 단위)
// 불변성 없음 , 현재 실무에서 거의 사용되지 않음
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClassMain {
    public static void main(String[] args) {
        Date now = new Date();
        DateFunc();
        calendarFunc();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        // 날짜를 원하는 포맷으로 파싱 시켜 줍니다.(패턴 매칭)
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

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
    static void DateFunc () {
        Date now = new Date();
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

    // Calendar 클래스 : Date 클래스의 단점을 보완하기 위해서 도입
    // java.util 포함
    // Calendar는 추상 클래스로, 특정 국가나 문화의 달력시스템에 맞게 하위 클래스가 구현된다.
    static void calendarFunc() {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));
    }
}
