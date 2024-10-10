package 컴페어러블;
// Comparable 나와 다른 객체를 비교할때 사용
public class Car implements Comparable<Car>{
    private String name;
    private int year;
    private String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {
        if(this.year == o.year) {
            int rst = this.name.compareTo(o.name);// 연식이 같으면
            if(rst == 0) { // 비교 조건에 대한 반환 값이 0이면 중복 제거가 됨
                // list 는 중복도 그대로 출력 tree set 은 중복 허용 x
                return this.color.compareTo(o.color);
            } else return rst;
            //return this.name.compareTo(o.name); // 모델이름으로 사전순 정렬

        }else if(this.year < o.year) return 1;
        else return -1; // 오름 차순 정렬 (즉 연식이 오래된것 부터 출력)
    }
}


//Comparable 인터페이스의 compareTo 메서드 반환값 의미
//0: 두 객체가 동일하거나 순서상 구분이 필요 없는 경우를 의미합니다.
// 예를 들어, 두 객체의 year, name, color 값이 모두 같을 때
// 0을 반환하면 이 객체들이 동일하다고 간주됩니다.
//양수(1 또는 그 이상): 현재 객체(this)가 비교 객체(o)보다
// 순서상 뒤에 있다고 간주합니다. 예를 들어, this.year < o.year일 때
// 1을 반환하면, this가 o보다 뒤에 위치해야 함을 나타냅니다.
//음수(-1 또는 그 이하): 현재 객체(this)가 비교 객체(o)보다
// 순서상 앞에 있다고 간주합니다. 예를 들어, this.year > o.year일 때
// -1을 반환하면, this가 o보다 앞에 위치해야 함을 나타냅니다.