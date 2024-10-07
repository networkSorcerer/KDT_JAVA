package 클론메서드;
// clone() : 해당 인스턴스를 복제하여 , 새로운 인스턴스를 생성해 반환
//(얕은 복사가 발생하는 경우)
// 얕은 복사 : 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사되고,
// 참조 타입의 경우는 참조하는 곳의 주소가 복사

public class CloneMethodEx {
    public static void main(String[] args) {
        Member mem1 = new Member("jks2024", "곰돌이사육사","sphb8250",23, true);
        Member mem2 = mem1; // 얕은 복사가 일어남

        mem2.id = "test1234";
        mem2.name = "달빛사냥꾼";

        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);

        System.out.println("ID : " + mem1.id);
        System.out.println("ID : " + mem2.id);


    }
}
