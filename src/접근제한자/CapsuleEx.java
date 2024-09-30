package 접근제한자;
// 접근 제한자란? 클래스와 인터페이스를 다른 패키지나 클래스에서의 접근을 제한하는 용도
public class CapsuleEx {
    public static void main(String[] args) {
        Child child = new Child("개발자");
        System.out.println(child.getJob());
        System.out.println(child.getMoney()); // 부모로부터 상속 받은 돈
        System.out.println(child.getName());// 부모님이 물려준 이름
        System.out.println(child.getAddr());// 부모님이 물려준 주소
    }
}

class Child extends Parent {
    String job;

    public Child(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    public String getAddr() {
        return addr;
    }
}