package 디폴트메서드;

public class Audio implements RemoteControl{
    private int volume; //인스턴스 필드 (객체로 만들어진 변수)
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        
    }
}
