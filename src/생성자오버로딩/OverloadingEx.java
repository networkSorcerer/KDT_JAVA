package 생성자오버로딩;
// 생성자는 클래스가 객체로 만들어 질 때 호출
// 생성자의 주요 사용 용도는 인스턴스 필드를 초기화 하기 위한 용도
// 생성자는 만들지 않으면 기본 생성자가 자동으로 생성됨(매개변수가 없는 기본 생성자)
// 생성자는 용도에 맞게끔 다양한 생성자를 만들 수 있음 (생성자 오버로딩)
public class OverloadingEx {
    public static void main(String[] args) {
        Television localTV = new Television();
        localTV.setChannel(1000);
        localTV.setVolume(50);
        localTV.getTV();
        Television northTV = new Television(false, 22, 22);
        northTV.getTV();
    }
}
