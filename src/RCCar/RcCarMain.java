package RCCar;

import java.util.Scanner;

import static java.lang.Thread.sleep;
// 게임 난이도를 설정 1,2,3 단계
// 제시되는 방향의 수와 시간이 달라짐
// awsd 중에서 무작위로 제시됨
// elapsedTime에 따라 계속 차의 상태와 방향키가 무작위로 나옴
// 똑같이 맞추어야 함
// 똑같이 맞춘 경우가 10번 이 되면 게임이 끝남 .
// 시도한 횟수가 많을 수록 낮은 점수를 받음

public class RcCarMain {
    public static void main(String[] args) throws InterruptedException {
        RcCar yohanRcCar = new RcCar();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0;
        boolean isSetGoal = false;
        System.out.println("Rc카의 전원을 켜시겠습니까? (yes / no) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")) {
            yohanRcCar.setPower(true);
            yohanRcCar.setRcCarState();
            while (true) {
                sleep(100);
                elapsedTime++;
                switch (yohanRcCar.getDirection()){
                    case "a" : if(elapsedTime >=10) isSetGoal = true; break;

                }
            }
            //yohanRcCar.rcCarInfo();

        }
    }
}
