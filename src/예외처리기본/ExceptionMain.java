package 예외처리기본;
// 프로그램에서 오류가 발생하는 경우는 크게 2가지
// 1. 컴파일 오류 (문법적 오류)
// 2. 실행중에 오류가 발생하는 경우 (런타임 오류)
// 컴파일 타임의 오류와 런타임 오류의 경우는 컴파일 타임에 발생하는 것이 훨씬 바람직

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain {
    public static void main(String[] args) {
        //fileNotFoundFunc();
        nullPointerFunc();
    }
    static void arrayExceptionFunc() {
        try {
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외 처리 부분");
        }
        System.out.println("프로그램 정상 종료");
    }
    static void fileNotFoundFunc() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 없습니다 계속 진행하시겠습니까? ");
        }
    }
    // NullPointerException
    static void nullPointerFunc() {
        Test test = null; // 참조하는 객체가 없음을 의미
        if(test != null) {
            System.out.println(test.name);
        }else {
            System.out.println("test 객체가 없습니다.");
        }
    }
}

class  Test {
    String name = "민지";
}
