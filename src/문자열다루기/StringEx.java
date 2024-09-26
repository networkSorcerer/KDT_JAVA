package 문자열다루기;

import java.util.Scanner;

// 문자열이란? 문자가 연속적으로 존재하는 데이터 형
// 자바에서는 문자와 문자열을 구분함. "문자열", '문자'
// 자바는 문자열을 참조 타입으로 간주 함
// 문자열을 표현하기 위해서는 객체를 만들어 사용하거나 리터럴 표기 방식으로 사용 함
// 리터럴 표기 방식이 가독성이나 성능에서 유리 함
public class StringEx {
    public static void main(String[] args) {
        String name1 = new String("곰돌이사육사");
        String name2 = "곰돌이사육사";  // 리터럴 표기 방법, 이게 좋음
        // 문자열 내장 메서드
        // equals() : 두개의 문자열 내용이 동일하진 비교하여 결과를 반환
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equals(b));            // false
        System.out.println(a.equalsIgnoreCase(b));  // true, 대소문자 구분 안함
        System.out.println(a == b);   // 주소가 같은지를 물어보는 경우가 됨

        // indexOf() : 문자열에서 특정 문자가 시작되는 인덱스 반환
        String c = "Hello Java";
        System.out.println(c.indexOf("Java"));

        // contains() : 문자열에서 특정 문자열이 포함되어 있는지의 여부를 반환
        System.out.println(c.contains("Hello"));  // true

        // charAt() : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(c.charAt(6));  // "J"

        // replace() : 특정 문자열을 다른 문자열로 대체 할 때
        String d = "안녕하세요. JAVA JAVA를 공부 하겠습니다.";
        System.out.println(d.replace("JAVA", "Python"));
        // replaceAll() : 정규식 적용 가능
        System.out.println(d.replaceAll("JAVA", "Python"));

        // substring() : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(6)); // 5에서 부터 끝까지
        System.out.println(e.substring(6, 8));  // 6에서 8 미만
        // toUpperCase/ toLowerCase
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        // trim() : 문자열의 앞/뒤의 공백 제거
        String f = "   안녕하세요.   오늘은 날씨가 좋아요.      ";
        System.out.println(f.trim());
        // split() : 문자열을 특정 문자열 기준으로 분리하는 메서드
        String g = "23:45:56";
        String[] timeStr = g.split(":");
//        for (String el : timeStr) {
//            System.out.print(el + " ");
//        }
        System.out.println(timeStr[0] + "시" + timeStr[1] + "분" + timeStr[2] + "초");
        // 문자열 포매팅 : 서식을 지정해서 문자열 만드는 것
        // System.out.printf(), String.format()
        System.out.printf("오늘의 온도는 %d입니다.\n", 35);
        String otherStr = String.format("오늘의 온도는 %d입니다.\n", 35);
        System.out.println(otherStr);

        // toCharArray() : 문자열을 문자 배열로 반환
        String strVal = "aslkdjflasdkjflaskdjflas;dfk";
        char[] chArray = strVal.toCharArray();
        for(char ec : chArray) {
            System.out.print(ec + " ");
        }

    }
    // 실습문제 : 대문자, 소문자로 이루어진 문자열을 입력 받아,
    // 대문자는 소문자로, 소문자는 대문자로 반환
    static void upperLowCh() {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 문자열을 입력 받음
        String inStr = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회하면서 인덱스로 문자 추출
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            // 추출된 문자가 대문자이면 문자 'a' - 'A' 만큼의 값을 더해줌
            if (ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
        }
        System.out.println();
    }
    static void reverseString() {
        // 스캐너 입력을 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 문자열 입력 받기
        String inStr = sc.next();
        // 반복문을 역순 순회
//        for(int i = inStr.length() - 1; i >= 0; i--) {
//            System.out.print(inStr.charAt(i));
//        }
        int pos = inStr.length() - 1;
        while (true) {
            System.out.print(inStr.charAt(pos));
            pos--;
            if (pos < 0)break;
        }
    }
}
