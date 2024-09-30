package 접근제한자;

public class Parent {
    protected String name; //protected : 같은 패키지 이거나 상속 관계가 존재하면 접근 가능
    String money; //접근 제한자가 없으면 default . 같은 패키지 내에서만 접근 가능
    public String addr; // 상속도, 같은 패키지 인지도 상관없이 접근 가능
    public Parent() {
        name="이건희";
        money ="2000억";
        addr="한남동";
    }

}
