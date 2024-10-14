package 자바파이널과제;
//- 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.
//- 이름 국어 영어 수학  형식
// 해당 파일을 읽어 총점을 구하고
// 총점이 높은 사람 순으로 이름과 총점 보여주기(총점이 같은 경우 이름순)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaFinalReportMain {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            //
            inputStream = new FileInputStream("src/자바파이널과제/student.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 스캐너 객체를 생성하는데, 입력을 파일에서 읽어 들임
        Scanner sc = new Scanner(inputStream);
        // 10명의 데이터를 파일에서 읽어들여 객체로 만들어서 리스트에 저장
        // 입력 순서대로 저장이 되고, 정렬을 위해서 sort() 메서드를 불러줘야 함
        List<Student> list = new ArrayList<>();
        while (sc.hasNextLine()) { // 읽어들일 라인이 있으면 true
            String line = sc.nextLine(); // 문자열 한라인을 변수 (String)에 담음
            String[] splitLine = line.split(" "); // 문자열을 공백 기준으로 잘라 문자열 배열을 생성
            // 생성자를 통해서 Student 객체를 리스트에 추가
            // 생성자의 매개변수로 전달되는 내용은 파일에서 읽어 들인 각 라인의 정보
            // 국어, 영어, 수학 성적은 연산이 필요하므로 정수로 형 변환
            list.add(new Student(splitLine[0], Integer.parseInt(splitLine[1]),
                    Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[3])));
        }
        // 리스트를 정렬할 때 사용하는 메서드
        // 리스트의 객체를 정렬하는 경우 Comparable 를 상속 받아 compareTo 구현 해줘야 함
        Collections.sort(list);
        // 향상된 for 문으로 리스트를 순회하면서 요소를 출력
        // 해당 요소의 객체가 toString 을 오버라이딩 하는 경우 메서드 접근 없이 toString() 내용 출력

        for (Student e : list) System.out.println(e);
    }
}

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public int getTotalScore() {
        return kor + eng + mat;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotalScore() != o.getTotalScore()) {
            // 결과가 양수이면 정렬 조건이 됨
            return o.getTotalScore() - this.getTotalScore();
        } else {
            // 총점이 같은 경우는 사전순 정렬을 하기 위해
            return this.name.compareTo(o.name);
        }
    }
    @Override
    public String toString() {
        return name + " : " + getTotalScore();
    }
}
