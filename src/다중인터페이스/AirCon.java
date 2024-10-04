package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // final static 이 자동으로 추가 됨, 상수로 처리, 설계 명세서 역할
    int MIN_TEMP = 0;
    void airConON(); // public abstract가 자동으로 추가 됨, 자식 클래스에서 반드시 오버라이딩 해야 함
    void airConOFF();
    void setAirConTemp(int tmp);
}
