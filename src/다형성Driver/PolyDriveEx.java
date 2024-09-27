package 다형성Driver;

import java.util.Scanner;

public class PolyDriveEx {
    public static void main(String[] args) {
        Driver driver = new Driver("김요한");
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 [1]스포츠카 [2]버스 [3]택시 [4]세단: ");
        int select = sc.nextInt();
        switch (select) {
            case 1 : driver.drive(new SportsCar());break;
            case 2 : driver.drive(new Bus());break;
            case 3 : driver.drive(new Taxi()); break;
            case 4 : driver.drive(new Sedan()); break;
            default: System.out.println("선택한 차량이 준비 되지 않았습니다. ");
        }
    }
}

class Driver {
    String name;
    Driver(String name) {//생성자
        this.name = name;
    }
    void drive(Vehicle v) {
        System.out.print(name + "의 "); //"의"는 여기를 걸쳐서 간다는 뜻인듯
        v.run(); //Vehicle을 상속받은 메소드의 run 함수가 실행된다.
    }
}

class Vehicle {
    void run() {
        System.out.println("탈 것이 달립니다. ");
    }
}

class SportsCar extends Vehicle {
    @Override
    void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Sedan extends Vehicle {
    @Override
    void run() {
        System.out.println("세단이 달립니다.");
    }
}