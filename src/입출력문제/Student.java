package 입출력문제;

public class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private int avg;
    public Student(String name, int kor, int eng, int math, int total, int avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.avg = avg;

    }
    public Student() {

    }
    @Override
    public String toString() {
        String grade;
        if (avg >= 90) {
            grade = " ░▒▓██████▓▒░\n" +
                    "░▒▓█▓▒░░▒▓█▓▒░\n" +
                    "░▒▓█▓▒░░▒▓█▓▒░\n" +
                    "░▒▓████████▓▒░\n" +
                    "░▒▓█▓▒░░▒▓█▓▒░\n" +
                    "░▒▓█▓▒░░▒▓█▓▒░\n" +
                    "░▒▓█▓▒░░▒▓█▓▒░"; // ASCII art for "A"
        } else if (avg >= 80) {
            grade = "░▒▓███████▓▒░  \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓███████▓▒░  \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓███████▓▒░  \n";
        } else if (avg >= 70) {
            grade = " ░▒▓██████▓▒░  \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    " ░▒▓██████▓▒░  \n";
        } else if (avg >= 60) {
            grade = "░▒▓███████▓▒░  \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓█▓▒░░▒▓█▓▒░ \n" +
                    "░▒▓███████▓▒░  \n";
        } else {
            grade = "░▒▓████████▓▒░ \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓██████▓▒░   \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░        \n" +
                    "░▒▓█▓▒░        \n";
        }
        return "이름 : " + name +", 총점 : " + total +", 평균 " + avg + ", 학점 : \n" + grade;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
}
