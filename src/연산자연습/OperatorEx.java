package 연산자연습;
// 산술연산자 : +, -, *, /, % (//, ** 없음)
// 대입연산자 : =, +=, -=, *=, /=, %=
// 증감연산자 : ++, -- (현재값에서 1을 증가 시키거나 감소 시키는 연산자)
// 비교연산자 : >, <, >=, <=, !=, ==
// 논리연산자 : &&(and), ||(or), !(not)
// 삼항연산자 : 조건식 ? 참인 경우 수행 구문 : 거짓인 경우 수행 구문
// 비트연산자 : 비트 단위의 저수준 조작을 하기 위한 연산자

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 0;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        try {
            System.out.println(num1 / num2); // 정수끼리 나눗셈을 수행하면 몫이 구해짐
            System.out.println((double) num1 / num2);
            System.out.println(num1 % num2);
        } catch (ArithmeticException e) {
            System.out.println("0을 나눌 수 없습니다.");
        }

        // 증감 연산자 : 해당 변수값을 1 증가 또는 감소 시키는 연산자
        System.out.println(++num1);  // 전위 증가연산자, 선 증가 후 대입
        System.out.println(num1);

        System.out.println(num1 += 2);  // num1 = num1 + 2
        System.out.println(num1 -= 2);  // num1 = num1 - 2
        System.out.println(num1 *= 2);  // num1 = num1 * 2
        System.out.println(num1 /= 2);  // num1 = num1 / 2

        // 비교 연산자 : 두개의 피 연산자를 비교하여, 큰지, 작은지, 같은지를 판단하는 것
        // 결과 값은 boolean 값으로 반환(true / false)
//        int x = 10, y = 20;
//        System.out.println(x > y); // false
//        System.out.println(x < y); // true
//        System.out.println(x == y); // false
//        System.out.println(x != y); // true
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true

        // 논리 연산자 :
        // &&(AND) 둘다 만족해야 참, A이고 B
        // ||(OR) 둘 중 하나만 참이면 참, A 이거나 B
        // !(NOT) 현재의 조건에 대한 부정이므로 반대가 됨
        int x = 10, y = 20;
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y);  // false
        rst2 = (x > 0) || (x > y);  // true
        rst3 = !((x > 0) || (x > y)); // false
        System.out.println(rst1 + " " + rst2 + " " + rst3);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//        // 조건식 ? 참인 조건 : 거짓인 조건
//        String isAdult = (age > 19) ? "성인" : "미성년자";
//        System.out.println("당신은 " + isAdult + "입니다.");

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        System.out.println(val1 + val2 * val3); // 30
        System.out.println((val1 + val2) * val3);  // 50
        System.out.println((val1 + ++val2) * val3); // 35

        // 100자리 정수를 입력 받아서 3개의 변수에 나누어 담아서 출력하기
        // 356 => a = 3, b = 5, c = 6
        // 키보드 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt(); // 스캐너 클래스로 만들어진 인스턴스 메서드
        int a = num / 100;   // num 값을 100 으로 나눈 몫 (정수형 연산이기 때문)
        int b = (num % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫
        int c = num % 10;
        System.out.printf("100자리 %d 10자리 %d 1자리 %d\n", a, b, c);











    }
}
