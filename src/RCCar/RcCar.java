package RCCar;

import java.util.Scanner;

public class RcCar {
    private boolean isPower; // 전원 ON/OFF
    private int speed;
    private boolean gasoline;
    private boolean right;
    private boolean left;
    private boolean carBreak;
    private int goalSpeed;
    private String direction;
    public RcCar() {
        isPower = false;
        right = false;
        left = false;
        carBreak = false;
        direction = ""; // 0은 좌측 1은 가운데 2는 우측이다.
    }

    void rcCarInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String gasolineStr = (gasoline) ? "bust on!" : "slow down";
        String rightStr = (right) ? "go Right" : "center";
        String leftStr = (left) ? "go Left" : "center";
        String breakStr = (carBreak) ? "slow down" : "keep going";

        System.out.println("============= 현재 주행 상태 =============");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 속도 : " + speed);
        System.out.println("목표 속도 : " + goalSpeed);
        System.out.println("가속 페달 : " + gasolineStr);
        System.out.println("우측 핸들링 : " + rightStr);
        System.out.println("좌측 핸들링 : " + leftStr);
        System.out.println("감속 페달 : " + breakStr);
    }

    public boolean isPower() {
        return isPower;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isGasoline() {
        return gasoline;
    }

    public void setGasoline(boolean gasoline) {
        this.gasoline = gasoline;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isCarBreak() {
        return carBreak;
    }

    public void setCarBreak(boolean carBreak) {
        this.carBreak = carBreak;
    }

    public int getGoalSpeed() {
        return goalSpeed;
    }

    public void setGoalSpeed(int goalSpeed) {
        this.goalSpeed = goalSpeed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setRcCarState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 속도가 " + speed + " 입니다. " );
        System.out.println("속도를 설정하세요 : " );
        goalSpeed = sc.nextInt();
        System.out.println("설정 속도는 " + goalSpeed + "입니다 ");
        System.out.println("방향을 설정 하세요 : a : 좌측 , d : 우측");
        direction = sc.nextLine();

        if(speed > goalSpeed) {
            System.out.println("차가 감속합니다.");
            gasoline = false;
            carBreak = true;
        } else if ( speed < goalSpeed) {
            gasoline = true;
            carBreak = false;
        } else {
            gasoline = true;
            carBreak = false;
        }

        if (direction.equals("a")) {
            gasoline = false;
            left = true;
            right = false;
            carBreak = false;
        } else if(direction.equals("d")){
            gasoline = false;
            left = false;
            right = true;
            carBreak = false;
        } else if(direction.equals("w")) {
            gasoline = true;
            speed ++;
            left = false;
            right = false;
            carBreak = false;
        } else if (direction.equals("s")){
            gasoline = false;
            speed --;
            left = false;
            right =false;
            carBreak =true;
        } else {
            gasoline = false;
            left = false;
            right = false;
            carBreak = false;
        }
    }
}
