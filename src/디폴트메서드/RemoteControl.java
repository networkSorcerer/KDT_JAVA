package 디폴트메서드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스에 포함된 필드는 모든 상수로 만들어 짐 (final static 추가됨)
    int MIN_VOLUME = 0; // 설계 명세에서 볼푸므이 설정 범위를 표시하기 위해서 사용할수 있음
    void turnON(); //자동으로 public abstract가 추가됨
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 메서드는 이후 추가 (예외 조항)
    // 인터페이스 생성 시 함께 생성되고 상속되지 않음
    static void changeBattery() {
        System.out.println("건전지를 교환합니다. ");
    }
}
