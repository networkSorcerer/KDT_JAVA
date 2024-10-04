package 자동차만들기Ipad;

import java.text.NumberFormat;
import java.util.Scanner;

import static 자동차만들기Ipad.CarDB.*;

public class Vehicle {
    private Scanner sc;
    private String carName;
    private int carType;
    private int goal;
    private int option;
    private int weather;
    private int roundTripCount;
    private String fuelEfficiency;
    private int passengers;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getRoundTripCount() {
        return roundTripCount;
    }

    public void setRoundTripCount(int roundTripCount) {
        this.roundTripCount = roundTripCount;
    }

    public String getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(String fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Vehicle(){
        this.sc = new Scanner(System.in);

    }
    public boolean continueOrder() {
        System.out.println("========= 차 만들기 =========== ");
        System.out.println("차 만들기를 진행하려면 yes / 종료는 no :");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true;
        else return false;
    }
    public void chooseGoal() {
        while (true) {
            System.out.println("도착지 선택 : [1]부산 [2]대전 [3]강릉 [4]광주");
            goal = sc.nextInt();
            if(goal == 1 || goal == 2 || goal == 3 ||  goal == 4) return;
            System.out.println("장소 선택이 잘 못되었습니다.");
        }
    }
    public void passenger() {
        System.out.println("이동할 승객수를 입력하세요.");
        passengers = sc.nextInt();
    }

    public  void chooseCar() {
        while(true) {
            System.out.print("자동차 선택 : [1] 스포츠 카 [2] 승용차 [3] 버스");
            carType = sc.nextInt();
            if(carType ==1 || carType == 2 || carType ==3) return;
            System.out.println("자동차 선택이 잘못되었습니다.");
        }
    }
    public void option() {
        while(true) {
            System.out.println("옵션 활성화 선택 : [1]ON [2]OFF ");
            option = sc.nextInt();
            if(option == 1 || option == 2) return;
            System.out.println("옵션선택이 잘못되었습니다.");
        }
    }
    public void weather() {
        while(true) {
            System.out.println("날씨를 선택해주세요 : [1]맑음 [2]비 [3]눈" );
            weather =sc.nextInt();
            if(weather ==1 || weather == 2 || weather ==3) return;
            System.out.println("날씨를 잘못 선택하셨습니다. ");
        }
    }
    public void setName() {
        System.out.println("차의 이름을 정하시겠습니까? yes or no ? : ");
        String service = sc.next();
        sc.nextLine();
        if(service.equalsIgnoreCase("yes")){
            System.out.println("이름을 입력하세요 : ");
            carName = sc.next();
        }
    }

    public void carInfo() {
        System.out.println("==========" +carName +"==========");
        System.out.println("목적지 : " + goalList[goal]);
        System.out.println("차 종 : " + car[carType]);
        System.out.println("시속 : " + speed[carType]);
        System.out.println("연비 : " + fuelEff[carType]);
        System.out.println("좌석수 : " + seat[carType]);
        System.out.println("승객수 : " + passengers + "명 입니다. ");
        System.out.println("날씨는 " + weatherList[weather]+" 입니다");
        System.out.println("옵션 활성화 여부 : " + optionList[carType] );
        System.out.println("왕복 횟수 : " + roundTripCount() + " 회");

    }
    public String roundTripCount() {
        NumberFormat numberFormat = NumberFormat.getInstance(); // 숫자 형식 포맷터
        int seats = Integer.parseInt(seat[carType]); // 선택한 차량의 좌석 수
        int passenger = passengers; // 승객 수
        int roundTripCount = 0; // 왕복 횟수 변수 초기화

        switch (carType) {
            case 1:
                // 스포츠카
                roundTripCount = (int) Math.ceil((double) passenger / seats); // 올림 처리로 왕복 횟수 계산
                break;

            case 2:
                // 승용차
                if (option == 1) {
                    // 트렁크를 좌석으로 추가한 경우 좌석 수 증가
                    seats += 1;
                    roundTripCount = (int) Math.ceil((double) passenger / seats);
                }
                roundTripCount = (int) Math.ceil((double) passenger / seats);
                break;

            case 3:
                // 버스
                roundTripCount = (int) Math.ceil((double) passenger / seats);
                break;

            default:
                System.out.println("Invalid car type.");
                return "0"; // 잘못된 carType이 입력된 경우 기본값 반환
        }

        return numberFormat.format(roundTripCount); // 왕복 횟수를 형식에 맞게 반환
    }

    //distance = 400;
    //distance =200;
    //distance = 150;
    // distance = 300;

}
