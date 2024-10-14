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
        Scanner sc = new Scanner(inputStream);
        List<Student> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] splitLine = line.split(" ");
            list.add(new Student(splitLine[0], Integer.parseInt(splitLine[1]),
                    Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[3])));
        }
        Collections.sort(list);
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
            return o.getTotalScore() - this.getTotalScore();
        } else {
            return this.name.compareTo(o.name);
        }
    }
    @Override
    public String toString() {
        return name + " : " + getTotalScore();
    }
}
