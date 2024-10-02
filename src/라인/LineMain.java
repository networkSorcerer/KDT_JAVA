package 라인;

import java.util.Scanner;

public class LineMain {
    public static void main(String[] args) {
        Line line = new Line("민지");
        line.writeMsg("오늘 날씨가 갑자기 쌀쌀해졌어요. 건강하게 활동 잘 하세요");
        NetworkLineAdaptor adaptor = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("메시지를 전송할 네트워크 선택 1 wifi : 2 5G : 3 LTE : ");
        int network = sc.nextInt();
        switch (network) {
            case 1 :
                adaptor = new WiFi();
                break;
            case 2 :
                adaptor = new FiveG();
            case 3 :
                adaptor = new LTE();
            default: System.out.println("전송할 네트워크 선택이 잘 못되었습니다.");
        }
        if(adaptor != null) line.send(adaptor);
    }
}
