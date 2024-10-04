package 다중인터페이스2번;

public class MultiInterface2 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer; //Customer 클래스 타입의 참조 변수를 Buy 인터페이스형에 대입
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        Customer customer1 = (Customer) seller;
        customer1.buy();
        customer1.sell();
        customer1.order();
    }
}

interface Buy {
    void buy();
    default void order(){
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주");
    }

}

class  Customer implements  Buy, Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");

    }

    @Override
    public void order() {
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");

    }
}
