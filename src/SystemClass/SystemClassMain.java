package SystemClass;

import static java.lang.Thread.sleep;

// System 클래스 : 표준 입/출력 관련, 시스템 정보 관련 메서드 제공
public class SystemClassMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random()*1000) +1; //1~1000사이의 임의의 값
        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long time1 = System.currentTimeMillis();
        // 1970년 1/1 00:00부터 경과시간표시
        for(i = 0; i < data.length; i++) {
            cnt++;
            sleep(1);
            if(randVal == data[i]){
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간은 " + (time2 - time1) + "밀리초 입니다.");
    }
}
