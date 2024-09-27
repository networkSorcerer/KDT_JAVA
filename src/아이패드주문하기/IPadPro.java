package 아이패드주문하기;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    private Scanner sc;
    private int screen;
    private int color;
    private int memory;
    private int network;
    private String name;
    private String productDate;
    String serialNum; //제품에 대한 일련번호
    private int price; // 제품 구매 가격
    private static int cnt = 0;
    public IPadPro(String name) {// 생성자는 클래스가 객체로 만들어질때 호출
        this.sc = new Scanner(System.in);
        this.name = name; //생성자 호출시 이름을 전달 받아서 초기값 지정
        Date now = new Date(); //현재 시간을 운영체제로 부터 받아옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); //지정된 format 형태로 시간 정보가 가공되어서 반환 됨
        cnt++;
        productDate += cnt;  // 산술연산이 아니고 문자열을 연결함
    }
    public boolean continueOrder(){
        System.out.println("========== iPad Pro 구입하기 ===========");
        System.out.println("구입을 진행하려면 yes / 종료는 no : ");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        else return false;

    }
    public void setScreen() {
        while(true) {
            System.out.print("디스플레이 선택 [1]11인치 [2]13인치");
            screen = sc.nextInt();
            if(screen == 1 || screen ==2) return;
            System.out.println("디스플레이 선택이 잘 못 되었습니다.");
        }
    }
    public void setColor() {
        while(true) {
            System.out.print("생삭을 선택 해주세요. [1]스페이스그레이 [2]실버 : ");
            color = sc.nextInt();
            if(color == 1 || color ==2) return;
            System.out.println("컬러를 다시 선택하세요");
        }
    }
    public void setMemory() {
        while(true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if(memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택 하세요.");
        }
    }
    public void setNetwork() {
        while(true) {
            System.out.print("네트워크 선택 : [1]wi-fi, [2]wi-fi+cellular : ");
            network = sc.nextInt();
            if(network ==1 || network ==2) return;
            System.out.println("네트워크를 다시 선택 하세요. ");
        }
    }
    public void setName() {
        System.out.println("각인 서비스를 신청하시겠습니까? yes or no? : ");
        String service = sc.next();
        sc.nextLine();
        if(service.equalsIgnoreCase("yes")){
            System.out.println("이름을 입력하세요 : ");
            name = sc.next();
        }
    }
    // 일련번호 만들기
    public void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memoryStr = {"", "256", "512","1024","2048"};
        String networkStr = (network ==1)?"W" : "C";
        serialNum = "iPadPro" + screenStr + memoryStr[memory] + networkStr + productDate;
    }
    // 제품 옵션 선택이 완료 되면  출고까지 30초 동안 제품 생산 진행 상황을 보여주고 출고
    public void progressIPadPro() throws InterruptedException{
        int cnt = 0;
        while(true) {
            sleep(300);
            cnt++;
            System.out.printf("<< iPadPro 제작 중 : [%d%%] >>\r" , cnt );
            if (cnt >= 100) break;
        }
    }
    // 제품에 대한 선택 옵션과 일련번호, 총 가격
    public void iPadProInfo() {
        final String[] screenType = {"", "11인치", "12.9인치"}; // 배열의 처음은 0이어서 숫자를 맞추려고 ""를 넣음
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType ={"", "wi-fi","wi-fi+cellular"};
        System.out.println("====== iPad가 출고 되었습니다. =======");
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("제품 가격 : " + iPadProCalcPrice() + "원");
        System.out.println("-----------------------------------");

    }

    // 선택한 옵션을 포함한 제품 가격 구하기
    public String iPadProCalcPrice() {
        // 각 옵션에 대한 가격을 설정합니다.
        NumberFormat numberFormat = NumberFormat.getInstance();
        int[] screenPrice = {0, 1499000, 1999000}; // 0: 기본 가격, 1: 11인치, 2: 12.9인치
        int[] memoryPrice = {0, 0, 300000, 90000, 150000}; // 0: 기본 가격, 1: 128GB, 2: 256GB, 3: 512GB, 4: 1TB
        int[] networkPrice = {0, 0, 300000}; // 0: 기본 가격, 1: wi-fi, 2: wi-fi+cellular

        // 각 옵션에 따른 가격을 합산합니다.
        int totalPrice = screenPrice[screen] + memoryPrice[memory] + networkPrice[network];

        return numberFormat.format(totalPrice); // 총 가격을 반환
    }


}
