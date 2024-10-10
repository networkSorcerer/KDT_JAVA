package 학생성적정렬하기;

public class Student implements Comparable<Student>{
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotalScore() {
        return kor + eng + math;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public int compareTo(Student s) {
        int totalDifference = s.getTotalScore() - this.getTotalScore();
        if(totalDifference != 0) {
            return totalDifference;
        }

        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "학생 이름 : " + name + ", 총점 : " + getTotalScore();
    }

}
