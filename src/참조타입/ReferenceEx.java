package 참조타입;
// 참조타입이란? 할당된 변수에 실제 값이 저장되는 것이 아니라 주소가 저장 됨
// 참조하는 대상이 없는 경우 : null point exception


public class ReferenceEx {
    public static void main(String[] args) {
        String name = "";
        String name2 = null;
        int age = 0;  // null 값 사용 불가,참조 타입이 아니기 때문
        Integer age2 = 0;  // Auto unboxing 기능이 있음

        int[] arr = null;  // 참조 타입은 초기값을 null 지정

        Integer boxVal = null;
        int intVal = boxVal;
        System.out.println(intVal);

    }
}
