package 자동차만들기Ipad;

import static 자동차만들기Ipad.CarDB.*;

public interface Calculator {
    int fuelLPerCost = 2000; // l당 비용


    // 총 비용
    // 총 주유 횟수
    // 총 이동 시간 :
    void totalCost();
    void refueling();
    void travelTime();

}

class CarCalculator implements Calculator {
    private Vehicle vehicle; // Vehicle 클래스의 인스턴스

    public CarCalculator(Vehicle vehicle) {
        this.vehicle = vehicle;

        // 이 부분은 생성자에서 초기화하는 대신 메서드에서 수행합니다.
    }

    @Override
    public void totalCost() {
        int goal = vehicle.getGoal();
        //System.out.println("goal 이 들어 가나요? " + goal);// Vehicle에서 목표지 정보를 가져옴
        int calDistance = distance[goal];
        //System.out.println("거리도 나오나요? " + calDistance);// 목적지까지의 거리
        int carType = vehicle.getCarType(); // 차종 정보 가져오기
        int fuelTank = CarDB.fuelTank[carType]; // 연료통
        int eff = fuelEfficiency[carType]; // 연비 정보

        int requiredFuel = calDistance / eff; // 비용 계산
        int cost = requiredFuel * 2000;
        System.out.println("총비용 : " + cost);
    }

    @Override
    public void refueling() {
        // 버스에서 예외 발생
        int goal = vehicle.getGoal(); // 목표지 정보 가져오기
        int calDistance = distance[goal]; // 목적지까지의 거리
        int carType = vehicle.getCarType(); // 차종 정보 가져오기
        int fuelTank = CarDB.fuelTank[carType]; // 연료통 용량
        int op = vehicle.getOption(); // 옵션 정보
        double eff = fuelEfficiency[carType]; // 연비 정보

        // 필요한 연료 계산
        double requiredFuel = calDistance / eff;
        double refuel;

        // 옵션이 ON인 경우
        if (carType == 3 && op == 1) {
            refuel = requiredFuel / (fuelTank + 30); // 30리터 추가 연료 통 고려
        } else {
            refuel = requiredFuel / fuelTank; // 일반 계산
        }

        // 주유 횟수를 올림 처리
        int refuelCount = (int) Math.ceil(refuel);

        System.out.println("주유 횟수 : " + refuelCount);
    }


    @Override
    public void travelTime() {
        int goal = vehicle.getGoal(); // 목표지 정보 가져오기
        double calDistance = distance[goal]; // 목적지까지의 거리
        int carType = vehicle.getCarType(); // 차종 정보 가져오기
        double speed = realSpeed[carType]; // 속도 정보
        // 날씨 요건 검토 필요
        int weather = vehicle.getWeather();
        double weatherSpeed = CarDB.weatherSpeed[weather];

        // 날씨에 따라 주행 시간 조정
        double time;
        if (weather == 2) {
            time = (calDistance / speed) * 1.2; // 날씨가 좋지 않을 경우, 주행 시간이 1.2배 증가
        } else if (weather == 3) {
            time = (calDistance / speed) * 1.4;
        } else {
            time = (calDistance / speed); // 일반 계산
        }

// 주행 시간 계산 옵션에 따른 추가 조정
        if (carType == 1 && vehicle.getOption() == 1) {
            if (weather == 2) {
                time = (calDistance / speed) * 1.2; // 날씨가 좋지 않을 경우, 주행 시간이 1.2배 증가
            } else if (weather == 3) {
                time = (calDistance / speed) * 1.4;
            } else {
                time = (calDistance / speed); // 일반 계산
            }
            time *= 1.2; // 옵션이 ON인 경우, 주행 시간이 1.2배 증가
        }

        System.out.println("주행 시간 : " + time);

    }
}