package Enum클래스예제2번;

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, ANALYSIS
}

enum Career {
    JUNIOR, SENIOR
}

enum GENDER {
    MALE, FEMALE
}

class Developer {
    private String name;
    private DevType type;
    private Career career;
    private GENDER gender;

    public Developer(String name, DevType type, Career career, GENDER gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}

public class EnumClassEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("곰돌이사육사", DevType.FRONTEND, Career.SENIOR, GENDER.MALE);
        developer.devInfo();
    }
}
