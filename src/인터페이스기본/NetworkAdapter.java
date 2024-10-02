package 인터페이스기본;

public interface NetworkAdapter {
    void connect(); // 인터페이스에 포함된 메서드는 자동으로 public abstract 가 추가됨

}

class WiFi implements NetworkAdapter {

    @Override
    public void connect() {

    }
}

