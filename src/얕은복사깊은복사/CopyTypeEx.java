package 얕은복사깊은복사;
//

public class CopyTypeEx {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = arr1;
        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;

        for(int e : arr2) System.out.print(e + " ");

    }
}
