package 스트림활용하기;

import java.util.ArrayList;
import java.util.List;

public class StreamApply {
    public static void main(String[] args) {
        TravelCustomer travel1 = new TravelCustomer("안유진", 21,1000);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진",21,1000));
        customerList.add(new TravelCustomer("유나",21,2000));
        customerList.add(new TravelCustomer("카즈하",21,3000));
        customerList.add(new TravelCustomer("혜린",18,800));

        System.out.println("===== 고객 명단 출력 =====");

        customerList.stream().map(e-> e.getName()).forEach(e->System.out.print(e+" "));

        System.out.println("===== 여행 총 비용 계산 =====");

        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println("총 여행 비용 : " + total);

        System.out.println("===20세 이상 명단 출력 ==");
        customerList.stream()
                .filter(c->c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted() // 중간 연산
                .forEach(s -> System.out.println(s)); // 최종 연산

    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
