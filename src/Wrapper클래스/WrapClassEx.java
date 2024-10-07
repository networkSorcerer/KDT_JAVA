package Wrapper클래스;
// Wrapper 클래스란?
// 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해주는 클래스

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class WrapClassEx {
    public static void main(String[] args) {
//        IntegerEx integerEx = new IntegerEx(100);
//
//        System.out.println(integerEx.x);

        // Boxing : 기본 타입을 참조 내에 넣는 것
//        Integer x = 100; // Auto Boxing
//        int xx = x;  // unboxing
        sortAndSearchFunc();
        sortComparatorFunc();



    }

    static void sortAndSearchFunc() {
        Integer[] array = {5,4,7,9,13,3,1,88,23};
        //Arrays.sort(array);  // 해당 값을 오름 차순 정렬
        Arrays.sort(array, Collections.reverseOrder());
        for (int e : array) System.out.print(e + " ");
        System.out.println();
        System.out.println("결과에 대한 인덱스 : " +Arrays.binarySearch(array, 88));
    }

    // 정렬 오버라이딩 : 상속 받은 메서드를 재정의
    // 과일 이름을 정렬하는 길이가 짧은 순으로 정렬하고 길이가 같은 경우
    // 사전 정렬 해주세요
    // Comparator 클래스의 compare메서드를 오버라이딩해서 정렬 조건 만듦

    static void sortComparatorFunc() {
        Integer[] array = {5,4,7,9,13,3,3,1,88,23,23};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1; // return 1 이라는 건
                return -1;
            }
        });
        for (int e : array) System.out.println(e  + " ");
    }
}

//class IntegerEx {
//    int x;
//    IntegerEx(int x ) {
//        this.x = x;
//    }
//}