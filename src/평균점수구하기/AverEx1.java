package 평균점수구하기;
// 학생수 5명에 대한 성적을 입력 받음
// 입력 받은 성적 중에서 40 점 미만이 있으면 40점 올림
// 평균 점수를 구해서 출력 하기
// 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.
import java.util.Scanner;

public class AverEx1 {
    public static void main(String[] args) {
        // 입력을 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 성적을 입력 받기 위한 정수형 배열 생성
        int[] score = new int[5];
        int total = 0;
        // 반복문을 순회하면서 입력 받은 성적이 40 미만이면 40으로 변경
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40;
            // 배열의 요소값을 더해서 총점 구하기
            total += score[i];
        }
        // 소수점 이하가 없으므로 정수값으로 평균 출력하기
        System.out.println(total / 5);

    }
}
