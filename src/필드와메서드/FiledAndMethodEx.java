package 필드와메서드;
// 필드 : 변수의 속성을 표현하는 필드
// 메서드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어 이므로 클래스 외부에 별도의 함수가 존재 할 수 없음
public class FiledAndMethodEx {
    public static void main(String[] args) {
        String factory = "현대자동차 울산 공장";
        Car gv70 = new Car("GV70", 220, 280, "Black");
        Car ionic5N = new Car("아이오닉5N", 250, 600, "White");
        Car x6 = new Car("X6", 230, 350, "Gray");
        Car santafe = new Car();
        Car sorento = new Car("쏘렌토");
        gv70.getCarInfo();
        ionic5N.getCarInfo();
        x6.getCarInfo();
        santafe.getCarInfo();
        sorento.getCarInfo();
        System.out.println(Car.productNumber);
        System.out.println(Car.company);
    }
    // 매개변수 개수를 알 수 없을 때 사용 하는 방법
    static int sum(int ...val) {
        int sum = 0;
        for(int e : val) {
            sum += e;
        }
        return sum;
    }
    // 클래스 메서드, 매개변수의 입력이 존재, 반환값도 존재
    static int sum(int a, int b) {
        return a + b;
    }
    static String sum(String a, String b) {
        return a + b;
    }
    static String sum(String a, int b) {
        return a + b;
    }
}

class Car {
    static int productNumber = 0;   // 클래스 필드, 프로그램 생성 시, 즉 클래스가 만들어질 메모리 생성
    static String company = "현대자동차";  // 클래스 필드
    String modelName;  // 인스턴스 필드, 객체가 생성될 때
    int speed;         // 인스턴스 필드
    int horsePower;    // 인스턴스 필드
    String color;      // 인스턴스 필드
    Car(){
        modelName = "싼타페";
        speed = 200;
        horsePower = 200;
        color = "red";
        productNumber += 1;  // 클래스 필드
    }
    Car(String name) {
        this.modelName = name;
        speed = 200;
        horsePower = 200;
        color = "red";
        productNumber += 1;  // 클래스 필드
    }
    // 매개변수가 있는 생성자, 클래스를 객체로 만들 때 호출
    Car(String name, int speed, int power, String color) {
         modelName = name;
         this.speed = speed;  // this는 자기 객체를 참조하는 변수
         this.horsePower = power;
         this.color = color;
         productNumber += 1;  // 클래스 필드
    }
    void getCarInfo() {
        System.out.println("이름 : " + this.modelName);
        System.out.println("속도 : " + this.speed);
        System.out.println("마력 : " + this.horsePower);
        System.out.println("색상 : " + this.color);
        System.out.println("--------------------------------");
    }
}
