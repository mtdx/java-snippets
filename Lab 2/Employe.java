
package javaapplication5;

public class Employe {
    private String name;
    private int age;
    private static String company = "BestIT";
    private double paycheck;
    private static int interns;

    public Employe(String name, int age, double paycheck) {
        this.name = name;
        this.age = age;
        this.paycheck = paycheck;

        if (this.age <= 25) {
            interns++;
        }
    }

    public Employe() {
        this("####", 18, 1900.00);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employe.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }

    public String toString() {
        return name + " " + age + " " + paycheck;
    }

    public static int getInterns() {
        return interns;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == this) {
           return true;
        }

        if (ob == null) {
            return false;
        }

        if (this.getClass() != ob.getClass()) {
            return false;
        }

        final Employe ob2 = (Employe) ob;

        if ((this.name == null) ? (ob2.name != null) : !this.name.equals(ob2.name)) {
            return false;
        }

        if (age != ob2.age) {
            return false;
        }

        if (paycheck != ob2.paycheck) {
            return false;
        }

        return true;
    }

}
