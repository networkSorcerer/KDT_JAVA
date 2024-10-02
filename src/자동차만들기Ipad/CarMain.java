package 자동차만들기Ipad;

public class CarMain {
    public static void main(String[] args) {
        while(true) {
            Vehicle vehicle = new Vehicle();
            if(!vehicle.continueOrder())break;
            vehicle.chooseGoal();
            vehicle.passenger();
            vehicle.chooseCar();
            vehicle.option();
            vehicle.weather();
            vehicle.setName();
            vehicle.carInfo();
            vehicle.roundTripCount(); // 왕복횟수
            // 총 비용
            // 총 주유 횟수
            // 총 이동 시간 :
            Calculator calculator = new CarCalculator(vehicle);
            calculator.totalCost();
            calculator.refueling();
            calculator.travelTime();

        }
    }
}
