package While반복문;
// While문 : 주어진 조건이 참인 동안 반복, 횟수가 정해지지 않은 경우에 많이 사용
// do ~ while : 선 실행하고 후 조건 비교

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age <= 200) break;  // 정상적인 값이 입력되면 탈출
            System.out.println("나이를 잘 못 입력 하셨습니다.");
        }

        do {
            System.out.print("나이를 입력 : ");
            age = sc.nextInt();
        } while (age < 0 || age > 200);

        System.out.println("당신의 나이는 " + age + "입니다.");
    }
}
