package javaapplication9;

import java.util.Comparator;

public class SortYear implements Comparator{

     @Override
     public int compare(Object o1, Object o2) {

        StudentUTM a = (StudentUTM) o1;
        StudentUTM b = (StudentUTM) o2;
        if (a.getYear() < b.getYear()) {
           return -1;
        } else if (a.getYear() == b.getYear()) {
           return 0;
        }
        return 1;
    }
}
