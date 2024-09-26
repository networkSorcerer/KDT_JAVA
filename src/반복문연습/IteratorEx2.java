package 반복문연습;
// 1 ~ 1000까지의 7의 배수를 구하고, 한줄에 10개 항목씩 출력하기
// for (초기값;최종값;증감값) { }
// 구구단 출력 하기
// 단수 입력 :

// 3번 : 입력이 5인 경우
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class IteratorEx2 {
    public static void main(String[] args) {
        multipleSeven();
        multiTable();
        starPrn();
    }
    public static void  multipleSeven() {
        for (int i = 1; i <= 1000; i++) {
            if(i % 7 == 0) {
                System.out.printf("%5d", i);
                if (i % 70 == 0) System.out.println();
            }
        }
        System.out.println();
    }
    public static void multiTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수 입력 : ");
        int n = sc.nextInt();
        System.out.println("==== " + n + "단 ====");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
    public static void starPrn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
