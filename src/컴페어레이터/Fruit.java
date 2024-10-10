package 컴페어레이터;

public class Fruit {
    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit( String name,int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }

}
