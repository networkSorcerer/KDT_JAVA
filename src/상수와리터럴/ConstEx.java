package 상수와리터럴;
import java.util.Scanner;
// 상수란? 메모리에 값이 한번 지정되면 변경 할 수 없음
// 자바에서는 상수 정의를 final키워드를 사용
// 상수는 관례상 모두 대문자로 선언
public class ConstEx {
    public static void main(String[] args) {
//        final double TAX_RATE;  // 상수 선언시 관례상 대문자로 변수 이름 선언
//        // 콘솔에서 입력 받기 위해서는 스캐너 클래스에 대한 객체를 생성해야 함
//        Scanner sc = new Scanner(System.in);
//        System.out.print("수입을 입력 하세요 : ");
//        int income = sc.nextInt();
//        TAX_RATE = 0.08;
//        System.out.printf("당신이 내야 할 세금은 %.2f", income * TAX_RATE);

        // 리터럴이란? 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 의미

        // 형변환이란? 선언된 타입을 다른 타입으로 변환하는 것
        // 묵시적 형변환 : 자동 변환이라고 하기도 함, 컴파일러 유리한 방향으로 알아서 바꿔주는 것
        // 명시적 형변화 : 개발자가 명확한 의도를 형을 변경하는 것
        int num1 = 1, num2 = 4;
        double rst = (double) num1 / num2;  // 명시적 형변환과 묵시적 형변환이 함께 일어남.
        System.out.println(rst);

        System.out.println(""+ rst + 10); // 연산자 우선순위에 의해서 문자열로 간주 됩니다.
        System.out.println(rst + 10 + "10"); // 먼저 숫자형 타입이 계산되고 문자열이추가 됩니다.

    }
}
