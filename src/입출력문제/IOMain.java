package 입출력문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// - 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.`
// - 이름 국어 영어 수학 형식`
// 해당 파일을 읽어 총점을 구하고`
// 총점이 높은 사람 순으로 이름과 총점 보여주기(총점이 같은 경우 이름순)`
public class IOMain {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        List<Student> list =new ArrayList<>();
        try {
            inputStream = new FileInputStream("src/입출력문제/score.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            String name = arr[0];
            int kor = Integer.parseInt(arr[1]);
            int eng = Integer.parseInt(arr[2]);
            int math = Integer.parseInt(arr[3]);
            list.add(new Student(name,kor, eng,math, (kor+eng+math),((kor+eng+math)/3)));

        }
        list.sort(new StudentCompare());
        for (Student e : list) {
            System.out.println(e);
        }
    }
}
