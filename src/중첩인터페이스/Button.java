package 중첩인터페이스;

public class Button {
    OnClickListener listener;
    // OnClickListener 상속 받은 객체
    // OnClickListener 인터페이스에 대한 참조 변수,
    // 외부에 객체를 만들어서 주입하는 형태

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); // 구현된 객체의 onClick() 메서드 호출
    }


    interface OnClickListener {
        void onClick(); // 추상메서드
    }
}
