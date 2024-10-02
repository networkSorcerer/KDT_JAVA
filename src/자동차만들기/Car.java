package 자동차만들기;

import java.util.Scanner;

public class Car {
    private int speed;
    private int fuelEfficiency;
    private int fuelTank;
    private int seat;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(int speed, int fuelEfficiency, int fuelTank, int seat, String name) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTank = fuelTank;
        this.seat = seat;
        this.name = name;
    }
    void carInfo() {
        System.out.println("총 비용 : ");
        System.out.println("총 주유 횟수 : ");
        System.out.println("총 이동 시간 : ");
    }
    // 위치 선택
    public void setGoalChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이동 지역 선택 : [1]부산 [2] ");
    }


}
