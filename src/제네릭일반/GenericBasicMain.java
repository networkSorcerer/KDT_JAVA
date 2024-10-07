package 제네릭일반;

import java.util.ArrayList;
import java.util.List;

// 제네릭이란? 데이터 타입을 일반화 한다는 의미,
// 데이터 타입 또는 자료구조에 상관없이 동일한 프로그래밍 가능
// 클래스나 메서드에서 사용할 내부 데이터 타입을 컴파일시 미리 지정하는 방식 사용
public class GenericBasicMain {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("안녕하세요.");
        System.out.println((String) list.get(0));
    }
}
