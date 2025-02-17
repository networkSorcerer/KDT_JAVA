package 생성자;

public class TVOverloading {
    public static void main(String []args){
        TV tv = new TV();
        tv.setON(true);
        tv.setChannel(200);
        tv.setVolume(50);
        tv.getTV();
        TV tv1 = new TV(true, 100, 100);
        tv1.getTV();
    }
}
class TV {
    private boolean isON;
    private int channel;
    private int volume;
    TV(){
        isON = false;
        channel = 10;
        volume = 10;
        System.out.println("전원 : " + false + ", 채널 : " + channel + ", 볼륨 : "+ volume);
    }
    TV(boolean isOn, int channel, int volume) {
        this.isON = isOn;
        this.channel = channel;
        this.volume = volume;
    }
    public void setON(boolean onOFF) {
        isON = onOFF;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV  :" + onOffStr);
    }
    public void setChannel(int cnl) {
        if(cnl >= 1 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을" + channel + "변경 하였습니다. ");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "변경 하였습니다.");
        }
    }
    public void getTV(){
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV State ======");
        System.out.printf("전원 : %s\n", onOffStr);
        System.out.printf("볼륨 : %d\n", volume);
        System.out.printf("채널 : %d\n", channel);
    }

}

