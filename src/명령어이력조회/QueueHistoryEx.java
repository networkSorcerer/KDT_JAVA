package 명령어이력조회;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 명령어 이력 조회
public class QueueHistoryEx {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        QueueHistoryEx history = new QueueHistoryEx();
        System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");
        while(true) {
            System.out.print("$ ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine().trim(); // 입력 받은 문자열의 앞/뒤의 공백을 제거
            if(cmd.equalsIgnoreCase("q")) { // 대소문자 구분없이 q 입력 시 종료
                System.exit(0); // 프로그램 강제 종료(System Call)
            } else if(cmd.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여 줍니다.");
            } else if(cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for(String e : history.queue) {
                    cnt++; // 명령 history 앞에 숫자를 붙여 주기 위해서 값 증가 시킴
                    System.out.println(cnt + " " + e);
                }
            } else {
                history.save(cmd);
                System.out.println(cmd);
            }
        }
    }
    void save(String cmd) {
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE) queue.remove();
    }
}