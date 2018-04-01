package javaapplication9;

import java.util.Comparator;

public class SortName implements Comparator {

    public int compare(Object o1, Object o2) {

        StudentUTM a = (StudentUTM) o1;
        StudentUTM b = (StudentUTM) o2;
        if (a.getName().compareTo(b.getName()) == 0) {
           return a.getFname().compareTo(b.getFname());
        }
        return a.getName().compareTo(b.getName());
    }


}