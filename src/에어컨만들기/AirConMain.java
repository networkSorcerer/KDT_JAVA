package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과 시간 계산
        boolean isSetTemp = false; // 현재 상태가 설정 중인 상태인지를 확인하는 조건
        System.out.println("에어컨을 켜시겠습니까? (yes / no ) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true); // 에어컨 켜기
            lgAirCon.setAirConState(); // 온도 설정과 바람 세기 설정
            while (true) { // 현재 온도와 설정 온도가 같을 때 까지 반복
                sleep(100);
                elapsedTime++; // 1초마다 경과시간 값이 1 씩 증가
                switch (lgAirCon.getWindStep()){
                    case 1 : if (elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if (elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if (elapsedTime >= 20) isSetTemp = true; break;
                }
                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                // 현재 온도와 설정 온도가 같으면
                if (lgAirCon.getCurTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
