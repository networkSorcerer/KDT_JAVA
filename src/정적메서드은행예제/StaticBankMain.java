package 정적메서드은행예제;
// static 멤버와 메서드는 클래스 생성 시 함께 생성되고,
// 객체 생성 시 만들어지지 않음
// 하나의 클래스에서 하나만 존재
// 한번 생성되면 프로그램 종료시 까지 사라지지 않음
// 정적 메서드에서는 인스턴스 필드나 메서드를 사용할수 없음

public class StaticBankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        kakao.setDiposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank() + "에 " + kakao.getAccount() + "이 있습니다.");

        System.out.println("계좌가 " + Bank.getCount() + "개설되었습니다.");

        System.out.println(Util.max(100, 200));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("20240930"));
    }
}
