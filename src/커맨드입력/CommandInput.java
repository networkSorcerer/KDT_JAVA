package 커맨드입력;
import static java.lang.System.exit;

public class CommandInput {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("인자값이 2개가 필요 합니다.");
            exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("결과 : " + (num1 + num2));
    }
}
