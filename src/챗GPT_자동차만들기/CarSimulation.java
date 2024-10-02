package 챗GPT_자동차만들기;

// 자동차 추상 클래스 정의
abstract class Car {
    protected int speed;                // 최고 속도
    protected double fuelEfficiency;    // 연비 (km/L)
    protected int fuelTankSize;         // 연료 탱크 크기 (리터)
    protected int seats;                // 좌석 수
    protected String name;              // 차량 이름

    public Car(int speed, double fuelEfficiency, int fuelTankSize, int seats, String name) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTankSize = fuelTankSize;
        this.seats = seats;
        this.name = name;
    }

    // 필요한 연료량 계산
    public double calculateFuelNeeded(int distance) {
        return distance / fuelEfficiency;
    }

    // 필요한 주유 횟수 계산
    public int calculateRefuelCount(int distance) {
        double fuelNeeded = calculateFuelNeeded(distance);
        return (int) Math.ceil(fuelNeeded / fuelTankSize);
    }

    // 주행 시간 계산
    public double calculateTravelTime(int distance, boolean isRainy, boolean isSnowy) {
        double travelTime = (double) distance / speed;
        if (isRainy) {
            travelTime *= 1.2; // 비가 오면 이동 시간 20% 증가
        } else if (isSnowy) {
            travelTime *= 1.4; // 눈이 오면 이동 시간 40% 증가
        }
        return travelTime;
    }

    // 총 비용 계산
    public int calculateTotalCost(int distance) {
        double fuelNeeded = calculateFuelNeeded(distance);
        return (int) (fuelNeeded * 2000); // 1리터당 2000원
    }

    // 차량 정보 출력 (추상 메서드로 정의)
    public abstract void printCarInfo();
}

// 스포츠카 클래스
class SportsCar extends Car {
    private boolean turboOn; // 터보 기능 여부

    public SportsCar(String name) {
        super(250, 8.0, 30, 2, name);
        this.turboOn = false;
    }

    // 터보 기능 설정
    public void setTurbo(boolean turboOn) {
        this.turboOn = turboOn;
        if (turboOn) {
            this.speed *= 1.2; // 터보 켜면 속도 20% 증가
        } else {
            this.speed = 250; // 터보 끄면 기본 속도로 복구
        }
    }

    @Override
    public void printCarInfo() {
        System.out.println("===== " + name + " =====");
        System.out.println("속도: " + speed + " km/h");
        System.out.println("연비: " + fuelEfficiency + " km/L");
        System.out.println("연료탱크 크기: " + fuelTankSize + " L");
        System.out.println("좌석 수: " + seats);
    }
}

// 승용차 클래스
class Sedan extends Car {
    private boolean trunkToSeat; // 트렁크 좌석 변경 기능 여부

    public Sedan(String name) {
        super(200, 12.0, 45, 4, name);
        this.trunkToSeat = false;
    }

    // 트렁크 좌석 변경 설정
    public void setTrunkToSeat(boolean trunkToSeat) {
        this.trunkToSeat = trunkToSeat;
        if (trunkToSeat) {
            this.seats += 1; // 트렁크가 좌석으로 변경되면 좌석 1개 추가
        } else {
            this.seats = 4; // 기본 좌석 수로 복구
        }
    }

    @Override
    public void printCarInfo() {
        System.out.println("===== " + name + " =====");
        System.out.println("속도: " + speed + " km/h");
        System.out.println("연비: " + fuelEfficiency + " km/L");
        System.out.println("연료탱크 크기: " + fuelTankSize + " L");
        System.out.println("좌석 수: " + seats);
    }
}

// 버스 클래스
class Bus extends Car {
    private boolean auxiliaryFuelTank; // 보조 연료탱크 기능 여부

    public Bus(String name) {
        super(150, 5.0, 100, 20, name);
        this.auxiliaryFuelTank = false;
    }

    // 보조 연료탱크 설정
    public void setAuxiliaryFuelTank(boolean auxiliaryFuelTank) {
        this.auxiliaryFuelTank = auxiliaryFuelTank;
        if (auxiliaryFuelTank) {
            this.fuelTankSize += 30; // 보조 연료탱크 켜면 연료탱크 크기 30리터 추가
        } else {
            this.fuelTankSize = 100; // 기본 연료탱크 크기로 복구
        }
    }

    @Override
    public void printCarInfo() {
        System.out.println("===== " + name + " =====");
        System.out.println("속도: " + speed + " km/h");
        System.out.println("연비: " + fuelEfficiency + " km/L");
        System.out.println("연료탱크 크기: " + fuelTankSize + " L");
        System.out.println("좌석 수: " + seats);
    }
}

// 메인 클래스
public class CarSimulation {
    public static void main(String[] args) {
        // 지역 거리 설정
        int busanDistance = 400;
        int daejeonDistance = 150;
        int gangneungDistance = 200;
        int gwangjuDistance = 300;

        // 사용자 입력으로 차량 선택 및 기능 설정
        SportsCar ferrari = new SportsCar("Ferrari");
        ferrari.setTurbo(true);
        ferrari.printCarInfo();
        printResults(ferrari, busanDistance, 1, false, false);

        Sedan gv80 = new Sedan("GV80");
        gv80.setTrunkToSeat(true);
        gv80.printCarInfo();
        printResults(gv80, busanDistance, 21, false, false);

        Bus tourBus = new Bus("관광버스");
        tourBus.setAuxiliaryFuelTank(false);
        tourBus.printCarInfo();
        printResults(tourBus, busanDistance, 10, false, false);
    }

    // 결과 출력 함수
    public static void printResults(Car car, int distance, int passengers, boolean isRainy, boolean isSnowy) {
        int refuelCount = car.calculateRefuelCount(distance);
        int totalCost = car.calculateTotalCost(distance);
        double travelTime = car.calculateTravelTime(distance, isRainy, isSnowy);

        System.out.println("총 비용 : " + totalCost + "원");
        System.out.println("총 주유 횟수 : " + refuelCount + "회");
        System.out.printf("총 이동 시간 : %.1f시간\n", travelTime);
        System.out.println();
    }
}
