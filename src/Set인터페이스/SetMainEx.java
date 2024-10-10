package Set인터페이스;

import java.util.HashSet;
import java.util.Objects;

public class SetMainEx {
    public static void main(String[] args) {
        HashSet<Member>hashSet = new HashSet<>();
        hashSet.add(new Member(1001,"유나"));
        hashSet.add(new Member(1002, "채원"));
        hashSet.add(new Member(1003,"지수"));
        hashSet.add(new Member(1003,"카리나"));
        for(Member e : hashSet) e.showMember();

    }
}

class Member {
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals
            (Object obj) {
        if(obj instanceof  Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
        System.out.println();

    }
}
