package 배열;
// 자바의 배열은 동일한 데이터 요소가 연속적으로 저장되는 자료 구조
// int[] arr = new int[4];
// 자바의 배열은 힙영역에 메모가 할당되고, 크기를 지정해야 함
// 배열의 개선된 형태는 List(Array List, Vector, Linked List)가 있음
// 배열이나 리스트의 형태는 시퀀스형 자료구조이므로 인덱스로 값이 접근

public class ArrayEx {
    public static void main(String[] args) {
        int[] score = new int[3]; // 길이가 3인 int형 배열 생성

        score[0] = 78;
        score[1] = 80;
        score[2] = 90;
        // 범위 기간 for문, 배열의 내용을 변경 할 수 있음, 범위를 지정해서 순회 가능
        for(int i = 0; i < score.length; i++) {
            score[i] = score[i] + 10;
            System.out.print(score[i] + " ");
        }
        System.out.println();
        // 향상된 for 문 사용, 배열의 내용을 변경 할 수 없음, 무조건 전체 순회
        for(int e : score) {
            e = e + 10;
            System.out.print(e + " ");
        }
        System.out.println();

        for(int e : score) {
            System.out.print(e + " ");
        }
    }

    // 배열의 선언하는 여러가지 방법
    static void arrayDefine() {
        int[] score1 = new int[4];  // Heap영역에 메모리 공간을 확보
        int[] score2 = {88, 99, 43}; // 컴파일러 크기를 알 수 있으므로 크기 지정 필요 없음
        int[] score3;
        score3 = new int[3];
        int[] score4;
        score4 = new int[]{34, 55, 66};
    }

}
