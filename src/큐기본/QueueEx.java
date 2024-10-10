package 큐기본;
// Queue 는 FIFO
// 자바에서 Queue 는 Linked List 를 활용하여 생성해야 하므로
// Linked List가
// import 되어야 함

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        // 객체를 queue 에 추가 , 실패시 false를 반환
        msgQueue.offer(new Message("MAIL","장원영"));
        msgQueue.offer(new Message("SMS","안유진"));
        msgQueue.offer(new Message("KAKAO","이서"));
        while (!msgQueue.isEmpty()){
            Message msg = msgQueue.poll();
            switch (msg.getCommand()){
                case "MAIL":
                    System.out.println(msg.getTo()+ "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.getTo()+"에게 문자를 보냅니다.");
                    break;
                case "KAKAO" :
                    System.out.println(msg.getTo()+"에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}