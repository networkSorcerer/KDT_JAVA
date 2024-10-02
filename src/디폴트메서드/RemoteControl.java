package 디폴트메서드;
// 디폴트 메서드 : 인터페이스에서 구현부가 있는 메서드를 의미

public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스에 포함된 필드는 모든 상수로 만들어 짐 (final static 추가됨)
    int MIN_VOLUME = 0; // 설계 명세에서 볼푸므이 설정 범위를 표시하기 위해서 사용할수 있음
    void turnON(); //자동으로 public abstract가 추가됨
    void turnOFF();
    void setVolume(int volume);

    // 디폴트 메서드는 이후 추가 (예외 조항)
    // 상속 받은 클래스에서 오버라이딩해도 되고, 하지 않아도 됨

    default void setMute(boolean mute) {
        if (mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 처리를 해제 합니다. ");
    }

    // 인터페이스 생성 시 함께 생성되고 상속되지 않음
    static void changeBattery() {
        System.out.println("건전지를 교환합니다. ");
    }
}
