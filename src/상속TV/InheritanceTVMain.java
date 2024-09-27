package 상속TV;

public class InheritanceTVMain {
    public static void main(String[] args) {
//        ProductTV lgTV = new ProductTV("우리집 TV");
//        lgTV.setPower(true);
//        lgTV.setVolume(30);
//        lgTV.setChannel(30 , true);
//        lgTV.tvInfo();
        //부모 클래스의 참조 변수로 자식 객체를 참조
        ProtoTypeTV samTV = new ProductTV("남의 집 TV");
        samTV.setChannel(1900);

    }
}
