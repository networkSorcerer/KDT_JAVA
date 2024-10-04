package 객체를배열로관리;

public class NameCard {
    private String name;
    private String email;
    private String phone;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("폰 : " + phone);
        System.out.println("이메일 : " + email);

    }


}
