package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower; // 전원 ON/OFF
    private int setTemp; // 온도 설정 기능
    private int curTemp; // 현재 온도
    private boolean isCooler; //에어컨 동작 여부
    private boolean isHeater; // 히터 동작 여부
    private int windStep; // 바람세기 : 1단 , 2단 , 3단
    // 생성자에서 인스턴스의 초기값을 부여
    // 현재 온도를 가져오기 위해서 Calendar 클래스를 이용해 현재가 몇월인지를 운영체제로 가져와서
    // 미리 정해둔 온도 배열에서 온도 값 가져 옴
    public AirCon() {
        final int[] monthTmp = {-5,3,10,15,22,28,32,30,24,16,8,1};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 배열의 인덱스 동일
        curTemp = monthTmp[month]; //해당 월에 대한 온도를 가져 옴
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    // 콘솔 화면에 현재 에어컨 정보 출력 하기
    // 온도가 바뀌면 바뀔 때 화면이 출력 되도록 구현
    void airConInfo() {
        String onOffStr = (isPower) ?  "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("========== 에어컨 정보 =========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + curTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }

    //에어컨 상태를 설정
    public void setAirConState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + curTemp + "도 입니다.");
        System.out.println("온도를 설정하세요 : " );
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + "도 입니다.");
        System.out.println("바람 세기를 설정 하세요 : ");
        windStep = sc.nextInt();

        if(curTemp > setTemp) { // 현재가 더운 상태, 온도를 내리라는 의미
            System.out.println("Cooler가 동작합니다. ");
            isCooler = true;
            isHeater = false;
        } else if (curTemp < setTemp) { // 현재가 추운 상태, 온도를 높이라는 의미
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }

    public boolean isPower() {
        return isPower;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    public int getCurTemp() {
        return curTemp;
    }

    public void setCurTemp(int n) { // 현재온도는  현재온도에서 입력된 값의 크기에서 조정해서 설정
        this.curTemp += n;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public int getWindStep() {
        return windStep;
    }

    public void setWindStep(int windStep) {
        this.windStep = windStep;
    }
}
