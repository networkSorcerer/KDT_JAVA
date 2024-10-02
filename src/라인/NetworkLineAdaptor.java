package 라인;

public interface NetworkLineAdaptor {
    void connect();
    void send(String name);
}

class WiFi implements NetworkLineAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetworkLineAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("FiveG >> " + msg);
    }
}

class LTE implements NetworkLineAdaptor {

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}


