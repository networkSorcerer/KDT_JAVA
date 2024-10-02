package 인터페이스기본;

import java.util.Scanner;

// 인터페이스란? 자바에서 다중 상속을 지원하기 위해서 만들어짐
// (자바는 다중 상속을 지원하지 않음)
// 인터페이스는 개발에 있어서 설계명세서 개념이라고 생각하면 된다
// 완벽한 추상화 : 모든 메서드가 추상메서드임 (단, 예외가 있음)
// 인터페이스에 포함되는 필드 :final static 이 자동으로 추가됨 (컴파일러) -상수가 됨
// 인터페이스에 포함되는 메서드 : public abstract 가 자동으로 추가됨 (컴파일러) - 추상 메서드
// 정적 메서드 : 객체와 상관없으므로 사용해도 됨 (구현부가 있음)
// 인터페이스 상속은 implements 키워드를 사용하고, 상속받는 개수는 무한대
// 인터페이스 문법을 사용하는 느슨한 결합관계를 달성하기 위해서 사용
public class InterfaceMain {
    public static void main(String[] args) {
        NetworkAdapter adapter;  // 객체화가 될 수 없음
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크 선택 : [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch(num) {
            case 1 :
                adapter = new WiFi("KT Megapass ");
                adapter.connect();
                break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                adapter.connect();
                break;
            case 3 :
                adapter = new Lte("LG U+");
                adapter.connect();
                break;
            default:
                System.out.println("네트워크 선택이 잘못되었습니다.");
        }
    }
}
