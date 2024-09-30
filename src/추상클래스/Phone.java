package 추상클래스;

public abstract class Phone { // 명식적으로 abstract 키워드 사용해서 추상 클래스  생성
    String name;
    boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    // 일반 메서드
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) {
            System.out.println("Phone 의 전원을 켭니다. ");
        } else {
            System.out.println("Phone의 전원을 끕니다.");
        }
    }
    abstract void call(); // 이름만 존재하는 추상 메서드, 상속 받은 자식 클래스에서 반드시 구현 해야 함

}
