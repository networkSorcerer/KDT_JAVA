package 상속과오버라이딩;
// final 키워드는 최대한 많이 쓰는게 좋다 . 더 이상 변경 불가
// final 키워드 : 클래스 , 필드 , 메서드 선언 시 사용 할 수 있음
// 메서드 사용하는 경우 상속하면 오버라이딩을 금지 할 수 있음
public class OverrideEx {
    public static void main(String[] args) {

    }
}

class Car {
    int speed;
    String color;
    String name;
    final void accelerator(){
        System.out.println("차의 속독가 증가합니다. ");
    }
    final void breakPanel() {
        System.out.println("차의 속도가 감소합니다 .");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        color = "red";
    }

//    @Override
//    void accelerator() {  // accelerator 에 final 이 붙어있어서 오버라이딩 금지 . 변경 금지
//        System.out.println("차가 하늘을 납니다");
//    }
//    @Override
//    void breakPanel() {
//        System.out.println("차의 물속으로 감소합니다 .");
//    }
    int getSpeed() {
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
        return isTurbo;
    }
    void infoCar() {
        System.out.println("이름" + name);
        System.out.println("속도" + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드" + isTurbo);

    }



}