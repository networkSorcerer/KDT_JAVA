package 상속TV;

import static 아이패드주문하기.Common.PROTOTYPE_CHANNEL_MAX;

public class ProtoTypeTV {
    boolean isPower;
    int channel;
    int volume;

    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl >  0 && cnl < PROTOTYPE_CHANNEL_MAX) {
            channel = cnl;
        } else {
            System.out.println("사용 범위가 아닙니다. ");
        }
    }

}
