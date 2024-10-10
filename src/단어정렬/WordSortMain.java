package 단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 단어의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        String[] word = new String[n];
        sc.nextLine();
        System.out.println("단어를 입력하세요 : ");
        for (int i =0; i < word.length; i++ ) {
            word[i] = sc.nextLine();
        }
        // set 컬렉션 : 순서를 보장하지 않음, 중복을 허용하지 않음
        // asList() : 배열을 컬렉션에 넣을 때 사용 하는 메서드
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // String[0] : 원래 생성된 크기 만큼을 넘기다는 의미
        word = hashSet.toArray(new String[0]);
        // Arrays.sort(word)
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
