package 스택기본;

import java.util.Stack;
// Stack은 LIFO :
// Stack은 내부적으로 Vector 클래스를 상속 받아서 사용
// push(객체) : 객체를 저장
// peek() : 스택의 최상위 값 확인
// pop() : 스택의 최상위 의 값 추출하면서 보여줌
// empty() : 스택이 비어 있는지 확인

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 최상위 값 확인
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.contains(1));


    }
}
