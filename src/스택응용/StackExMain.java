package 스택응용;

import java.util.Scanner;
import java.util.Stack;

public class StackExMain {
    public static void main(String[] args) {
        // Character는 char 의 객체 타입
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식입력 : ");
        String exp = sc.next();
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i); // 문자열에서 인덱스에 해당하는 문자를 반환
            if(ch == '(') {
                st.push(ch); // 열림 괄호 일 때 push
            } else if(ch == ')') {
                if(!st.isEmpty())st.pop(); // 닫힘 괄호 일 때 pop
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
    }
}
