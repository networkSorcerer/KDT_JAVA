package 싱글톤;

public class Singleton {
    String name;
    int id;
    // 정적 변수로 Singleton 클래스에 대한 참조 변수 =>
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name ="네트워크마법사";
        id=100;

    }
    static Singleton getSingleton() {
        return singleton;
    }

}
