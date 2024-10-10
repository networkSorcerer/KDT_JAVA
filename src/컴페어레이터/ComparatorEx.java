package 컴페어레이터;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitCompare());
        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("수박",10000));
        treeSet.add(new Fruit("딸기",12000));

        for(Fruit e : treeSet) System.out.println(e);
    }
}
