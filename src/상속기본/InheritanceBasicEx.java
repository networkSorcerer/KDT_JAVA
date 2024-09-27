package 상속기본;
// 자식 클래스가 부모 클래스의 기능을 그래도 물려받는 것
// 상속 받은 자식 클래스는 부모클래스와 같거나 크다
// 부모 클래스가 먼저 생성되고 자식 클래스가 생성,
// 소멸 시에는 자식 클래스가 사라지고 부모 클래스가 소멸
// 사용하는 이유는 재사용성, 확장성, 다형성 (오버라이딩, 상속받은 기능을 재정의)
// 자바는 다중상속을 지원하지 않음
// (다중과 유사한 기능을 제공하기 위해서 인터페이스 있음 )
// 키워드 extends
// 상속을 받지 않은 클래스는 기본적으로 Object 클래스로 부터 상속을 받음
// 오버라이딩은 부모

public class InheritanceBasicEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("댕댕이");
        System.out.println(dog.getName());

        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep(4);
    }
}

class Animal  {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class  Dog extends Animal {
    void sleep() {
        System.out.println(name+ " zzz");
    }
}

class HouseDog extends Dog {
    @Override  //오버라이드 관계를 체크해줌 Dog의 sleep을 주석주면 오류로 체크 됨 오버라이드 되는지만 체크
    // 오버라이딩 관계가 성립하려면 메서드 이름과 반환 타입도 같아야 함
    void sleep() {
        System.out.println(name + " zzz in house");
    }
    // 오버라이딩 이후 오버로딩
    void sleep(int hour) {
        System.out.println(name + " zzz in house for " + hour + "hour");
    }
}