package 디폴트메서드;
// 인터페이스 모든 문법과 디폴트메서드에 대해서 학습

import java.util.Scanner;

public class DefaultMethodMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl rc;
        System.out.println("제품 선택 : [1]TV , [2]Audio : ");
        int sel = sc.nextInt();
        if(sel == 1) {
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
            RemoteControl.changeBattery();
            Television tv = new Television();
            tv.getInfo();
            rc.setMute(true);
        } else {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(102);
            Audio audio = new Audio();
            audio.turnON();
            audio.getInfo();
            rc.setMute(true);
        }
    }
}
