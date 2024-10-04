package 차만들기;

import java.text.DecimalFormat;

import static 차만들기.Common.FUEL_PRICE;

public class Car {
    protected int maxSpeed;
    protected int fuelEff;
    protected int fuelTank;
    protected int seatCnt;
    protected String name;

    public Car(int maxSpeed, int fuelEff, int fuelTank, int seatCnt, String name) {
        this.maxSpeed = maxSpeed;
        this.fuelEff = fuelEff;
        this.fuelTank = fuelTank;
        this.seatCnt = seatCnt;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //총 이동 횟수
    int getMovingCnt(int passCnt) {
        if(passCnt % seatCnt !=0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    //총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        if(((dist*moveCnt) / fuelEff) % fuelTank != 0) return (((dist * moveCnt)/fuelTank) +1);
        return ((dist*moveCnt)/fuelEff) /fuelTank;
    }

    //총 이동 비용
    String getTotalCost(int dist, int moveCnt) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(((long) dist / fuelEff)*FUEL_PRICE*moveCnt);
    }
    //총 소요 시간
    String getMovingTime(int dist, int moveCnt, int weather) {
        double getTime = (double) dist * moveCnt / maxSpeed;

        switch (weather) {
            case 2 : getTime*=1.2; break;
            case 3 : getTime*=1.4; break;
            default:
        }
        int totalMinute= (int) (getTime*60);
        int hour = totalMinute/ 60;
        int minute = totalMinute%60;
        return String.format("%d시간 %d분", hour, minute);
    }

    void setMode(boolean isMode) // 상속받은 각각의 자동차의 특수기능
    {

    }


}
