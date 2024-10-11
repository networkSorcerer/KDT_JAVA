package 입출력문제;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getTotal() < o2.getTotal()) return 1;
        else if(o1.getTotal() == o2.getTotal()){
            return o1.getName().compareTo(o2.getName());
        } else return -1;
    }
}
