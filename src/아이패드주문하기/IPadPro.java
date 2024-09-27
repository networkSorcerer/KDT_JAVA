package 아이패드주문하기;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IPadPro {
    private Scanner sc;
    private int screen;
    private int memory;
    private int network;
    private String name;
    private String productDate;
    private static int cnt = 0;
    public IPadPro(String name) {// 생성자는 클래스가 객체로 만들어질때 호출
        this.sc = new Scanner(System.in);
        this.name = name; //생성자 호출시 이름을 전달 받아서 초기값 지정
        Date now = new Date(); //현재 시간을 운영체제로 부터 받아옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
    }

}
