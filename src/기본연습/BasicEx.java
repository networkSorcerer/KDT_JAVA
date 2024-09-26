package 기본연습;
/*
   Date : 2024.09.23
   Author : 정경수
   Purpose : 연습용 프로그램
 */

public class BasicEx {
    // public은 접근 제한자, 정적메서드, void는 반환값이 없음을 의미
    // main은 프로그램의 시작 지점, 프로그램 실행 시 인자값을 받기 위한 부분
    public static void main(String[] args) {
        System.out.print(7);System.out.println(700);
        System.out.println("문자열을 이어서 " + "출력하기");
        System.out.println("성적 : " + 98 + 100);
        System.out.println(100 + 200 + "점수");
        System.out.printf("%d점\n", 300);
        System.out.printf("%s\n", "경기도 수원시");
        String gender = "MM";   // 자바는 문자와 문자열은 다르다.
        System.out.printf("%s\n", gender);
        System.out.printf("%.2f\n", 3.14159245);

        char test = 'A';
        System.out.printf("%d\n", (int)test);


        int age = 23;
        String name = "곰돌이사육사";


    }
}
