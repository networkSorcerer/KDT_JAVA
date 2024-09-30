package 추상클래스;
// 추상 클래스 : 인스턴스화가 안되는 클래스
// 부모가 만든 추상 메서드는 자식이 반드시 구현해야 함
// 단일 상속만 지원
//
public class AbstractMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 16");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
