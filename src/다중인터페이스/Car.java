package 다중인터페이스;

public class Car {
    protected int speed;
    protected String color;
    protected String year;

    public Car() {
        this.speed = 150;
        this.color = "white";
        this.year = "1999";
    }

    public Car(int speed, String color, String year) {
        this.speed = speed;
        this.color = color;
        this.year = year;
    }
}
