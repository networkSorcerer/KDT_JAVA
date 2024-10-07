package 제네릭프린터;

public class Nylon extends Material {
    @Override
    public void doPrinting() {
        System.out.println("나일론 재료로 출력 합니다.");
    }
    @Override
    public String toString() {
        return "재료는 나일론 입니다.";
    }
}
