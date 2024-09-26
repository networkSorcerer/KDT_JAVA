package 등급출력하기;
// 국어, 영어, 수학 성적을 입력 받아서 총점을 구하고
// 평균이 90점이상이면 A
// 80점 이상이면 B
// 70점 이상이면 C
// 60점 이상이면 D
// 나머지는 F
// 각각의 성적은 0 ~ 100로 입력되어야하고 입력값이 잘못된 경우 재입력을 받아야 함.

import java.util.Scanner;

public class GradeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적 입력 (국어 영어 수학) : ");
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) ||
                    (mat < 0 || mat > 100)) {
                System.out.print("성적 정보가 잘 못 입력 되었습니다.");
            } else {
                double avg = (double) (kor + eng + mat) / 3;
                if (avg >= 90) System.out.println("A");
                else if (avg >= 80) System.out.println("B");
                else if (avg >= 70) System.out.println("C");
                else if (avg >= 60) System.out.println("D");
                else System.out.println("F");
                break;
            }
        }
    }
}
