package List인터페이스;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료구조 (인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어있지 않음
// 데이터를 다루기 위한 다양한 메서드 제공
// List 인터페이스의 구현체인 ArrayList Vector , Linked List의 사용 방법이 동일
public class ListBasicEx {
    public static void main(String[] args) {

        // List 인터페이스의 참조 변수로 ArrayList 생성된 객체를 참조 함
        List<String> fruits = new ArrayList<>();

        // 요소 추가, 리스트 맨뒤에 요소를 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력, toString() 메서드가 오버라이딩 되어있음
        System.out.println("과일 목록 : " + fruits.toString());

        // 특정 인덱스에 요소 추가
        fruits.add(1,"Grape");
        System.out.println("과일 목록 : " + fruits);

        // 요소 가져오기 (인덱스 접근)
        System.out.println("과일 요소 : " + fruits.get(2));

        //요소 제거 하기
        fruits.remove(2);
        System.out.println("과일 목록 : " + fruits);

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + fruits.size());

        for(String e : fruits) {
            System.out.print(e + " ");
        }
        
    }
}
