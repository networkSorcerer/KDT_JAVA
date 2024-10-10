package 학생성적정렬하기;
// 5명의 학생에 대한 이름과 국어, 영어 , 수학 성적을 입력 받아서
// 총점 기준으로 정렬 하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전순 정렬

import java.util.Scanner;
import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int total;

        for(int i =1; i <= 5; i++){
            System.out.print("학생" + i + "의 이름 : ");
            String name = sc.nextLine();

            System.out.print("국어 점수: ");
            int kor = sc.nextInt();

            System.out.print("영어 점수: ");
            int eng = sc.nextInt();

            System.out.print("수학 점수: ");
            int math = sc.nextInt();
            sc.nextLine(); // 다음 입력을 위해 개행 문자 소비

            treeSet.add(new Student(name, kor, eng, math));
        }

        System.out.println("\n정렬된 학생 성적 목록 : ");
        for (Student s : treeSet) {
            System.out.println(s);
        }
        sc.close();
    }
}
