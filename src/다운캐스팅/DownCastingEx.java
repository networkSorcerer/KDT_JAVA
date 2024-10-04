package 다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅 : 상위 클래스형으로 변환되었던 하위 클래스를 다시 원래 자료형으로 변환
// 인스턴스 instanceof 클래스 : 형 변환 여부를 확인하는 것
public class DownCastingEx {
    // Animal 타입의 요소로 이루어진 ArrayList 선언
    ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        DownCastingEx downCast = new DownCastingEx();
        downCast.addAnimal();
        downCast.downCasting();
    }
    public void addAnimal() {
        animals.add(new Animal());  // Animal 클래스로 객체 생성
        animals.add(new Tiger());
        animals.add(new Human());
        animals.add(new Eagle());
        for(Animal e : animals) e.move();
    }

    public void downCasting() {
        for (Animal ani : animals) { // Use enhanced for loop for simplicity
            // `instanceof`로 타입 검사 후 다운캐스팅
            if (ani instanceof Human) {
                Human h = (Human) ani; // Human으로 다운 캐스팅
                h.readBook();          // Human 클래스의 메서드 호출
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani; // Tiger로 다운 캐스팅
                t.hunting();              // Tiger 클래스의 메서드 호출
            } else if (ani instanceof Eagle) {
                Eagle b = (Eagle) ani;   // Bird로 다운 캐스팅
                b.flying();               // Bird 클래스의 메서드 호출
            } else {
                System.out.println("Unknown Animal type");
            }
        }
    }
}
