package 입력받기연습;
// 이름 : String,  next() 공백 기준으로 문자열 입력
// 주소 : String,  nextLine() 줄바꿈 문자 기준으로 문자열 입력
// 성별 : char,    next().charAt(0) 문자열에서 0번째 문자 추출
// 나이 : int,     nextInt()  정수을 입력 받음
// === 회원 정보 출력 ===
// 이름 :
// 주소 :
// 성별 :
// 나이 "

import java.util.Scanner;

public class ScannerInputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 : ");
        String name = sc.next();
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소를 입력 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력 : ");
        char gender = sc.next().charAt(0); // 문자열의 인덱스
        System.out.print("나이를 입력 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
