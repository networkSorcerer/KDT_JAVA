package 스캐너클래스;
// 기본적인 데이터 타입에 대한 입력을 Scanner 클래스 메서드를 사용하여 입력 받을 수 있음
import java.util.Scanner;  //스캐너 클래스는 util 패키지내에 존재하므로 import 해야 함.

public class ScannerEx {
    public static void main(String[] args) {
        // sc : 스캐너 클래스에 대한 참조 변수 (Scanner 클래스로 만들어진 객체의 주소)
        // new : heap 메모리 할당, 동적할당, 메모리에 대한 해제를 해야 함
        // System.in : 콘솔로 부터 입력을 받기 위한 객체로 생성
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); // byte 형에 대한 입력 받아서 반환
        short b = sc.nextShort(); // short
        int c = sc.nextInt();
        long d = sc.nextLong();
        // next() : 공백 기준으로 문자열을 입력 받음, 그중에 해당 인덱스의 문자를 추출
        char ch = sc.next().charAt(0); // 스캐너는 문자에 대한 입력 방식 없음

        float e = sc.nextFloat();
        double f = sc.nextDouble();

        String g = sc.next(); // 공백 기준으로 문자열 입력 받음
        String h = sc.nextLine(); // 줄바꿈 문자 기준으로 문자열 입력 받음





    }
}
