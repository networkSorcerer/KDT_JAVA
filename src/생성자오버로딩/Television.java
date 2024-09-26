package 생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음(void 안됨)
// 생성자는 외부에서 접근해야 하기 때문 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근 제한자를 private해서 객체 생성을 제한 할 수 있음
// 채널은 1 ~ 999 유효한 값
// 볼륨은 0 ~ 100
public class Television {
    private boolean isON;  // 전원 ON/OFF
    private int channel;   // 채널 설정
    private int volume;    // 볼륨 설정
    // 기본 생성자는 생성자가 없는 경우에 자동 생성 됨
    public Television() {
        isON = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출");
    }
    public Television(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("매개변수가 전부 있는 생성자 호출");
    }
    public void setON(boolean onOff) {
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV : " + onOffStr);
    }
    public void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을 " + channel + "변경 하였습니다.");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "변경 하였습니다.");
        }
    }
    public void getTV() {
        // 3항 연산자 조건식 참이면 앞, 거짓이면 뒤가 선택
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV 정보 ======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}
