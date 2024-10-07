package 클론메서드;

import java.io.Closeable;
import java.io.IOException;

// Cloneable 인터페이스는 복제 허용에 대한 부분
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }


    public Member getMembber() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e ) {
            e.printStackTrace();
            System.out.println("예외 발생" + e);
        }
        return cloned;
    }

}
