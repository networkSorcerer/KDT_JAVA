package 집주소;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeAddr {
    public static void main(String[] args) {
//
//        int [] number = {4,2,3,3,3,3,3,3,3,3};
//        int sum=0;
//
//        int[]rst = new int[100];
//
//        int index = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            String num = sc.nextLine();
//
//            if (num.equals("0")) break;
//
//            for (int i = 0; i < num.length(); i++) {
//                sum += number[num.charAt(i) -'0' ]+1; // + 1은 각 숫자 앞의 공백
//            }
//            rst[index++] = sum + 1; // 1은 숫자 마지막의 공백 1칸
//
//            sum = 0;
//        }
//        for (int i =0; i < index; i++){
//            System.out.println(rst[i]);
//        }
        int [] number = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0;
        List<Integer> rst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++){
                sum += number[num.charAt(i) -'0'] +1;
                //여기서 -'0'은 숫자 문자를 정수형(int) 값으로 변환해주는 역할을 합니다.
                //'1' -> 1
            }
            rst.add(sum + 1); //리스트의 마지막 인덱스에 값이 추가 됨

            sum = 0;
        }
        for (int e : rst) System.out.println(e);
    }
}
