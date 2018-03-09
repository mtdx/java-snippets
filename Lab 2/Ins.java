


package javaapplication5;

import java.util.Scanner;
import java.util.Arrays;

public class Ins {
    public static void main(String[] args) {
    
        Employe ob1 = new Employe("Name", 23, 4005.3);
        Employe ob2 = new Employe("Name", 23, 4005.3);
        Employe ob3 = ob1;

        System.out.println(ob1 == ob2);
        System.out.println(ob1.equals(ob2));
        
        Scanner s = new Scanner(System.in);
        System.out.print("n = ");
        int n = s.nextInt();

        Employe v[] = new Employe[n];
        String name;
        int age;
        double paycheck;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Name = ");
            name = s.next();

            System.out.print("Age = ");
            age = s.nextInt();

            System.out.print("Paycheck = ");
            paycheck = s.nextDouble();

            v[i] = new Employe(name, age, paycheck);
        }

        System.out.println(Arrays.toString(v));
        System.out.println(Employe.getInterns());
    }
}