package 이차원배열;

public class DoubleArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
            }

        }
        for (int[] ee : arr) {  // 행
            for (int e : ee) {  // 0 행에 한번 순휘, 1행 순회
                System.out.print(e + " ");
            }
            System.out.println();
        }

        String[] strArr = {"Java", "Python", "C++", "C", "Kotlin"};

        for (String e: strArr) {
            System.out.print(e.charAt(0));
        }


    }
}
