package 예외처리미루기;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) throws IOException {
        IOSample ioSample = new IOSample();
        ioSample.input();
        ioSample.output();
    }
}
// 예외처리 미루기
class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read(); // ASCII 코드값으로 반환
    }
    public void output() {
        System.out.println(num);
    }
}
