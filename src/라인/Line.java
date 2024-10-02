package 라인;

import 코코아톡.NetworkAdaptor;

public class Line {
    private String to; //상대방 이름
    private String msg;
    public Line(String name) {
        to = name;
    }

    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetworkLineAdaptor adaptor) {
        adaptor.send(msg);
    }
}
