package 매개변수의다형성;
// 상속 관계를 이용해 매개변수에 자식 타입의 객체를 대입함

public class ParamPolyEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation());
        //위 문법의 설명버전이 아래 코드
        TV tv = new TV();
        buyer.buy(tv);
        buyer.buy(new Computer());
        buyer.viewInfo();
    }
}

class Product {
    int price;
    int bonusPoint;
}
class TV extends Product {
    public TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}
class  Computer extends Product {
    public Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}
class PlayStation extends Product {
    PlayStation() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }

}