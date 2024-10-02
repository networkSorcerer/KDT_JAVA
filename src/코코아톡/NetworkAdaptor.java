package 코코아톡;

public interface NetworkAdaptor {
    void connect(); //public abstract가 추가 됨
    void send(String msg);
}

class WiFi implements NetworkAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetworkAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("FiveG >> " + msg);
    }
}

class LTE implements NetworkAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}

