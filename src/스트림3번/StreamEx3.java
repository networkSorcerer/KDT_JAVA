package 스트림3번;
// 스트림을 통한 병렬 처리
// 내부 반복자는 요소들의 반복순서를 변경하거나, 멀티코어 CPU를 최대한 활용하기 위해
// 요소들을 분배시켜 병렬처리를 하수 있게 도와줌

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "안유진", "장원영", "레이", "이서", "리즈"
        );
        // 순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(StreamEx3 :: print);
        System.out.println();

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(StreamEx3 :: print);
        System.out.println();
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
