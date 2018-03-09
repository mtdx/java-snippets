package javaapplication5;

public abstract class EmployeUTM {
    private String name;
    private double basePaycheck;
    private static String college = "UTM";

    public EmployeUTM(String name, double basePaycheck) {
        this.name = name;
        this.basePaycheck = basePaycheck;
    }

    public EmployeUTM() {
        this("####", 1900.00);
    }

    public double getBasePaycheck() {
        return basePaycheck;
    }

    public void setBasePaycheck(double basePaycheck) {
        this.basePaycheck = basePaycheck;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        EmployeUTM.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeUTM other = (EmployeUTM) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.basePaycheck != other.basePaycheck) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.basePaycheck) ^ (Double.doubleToLongBits(this.basePaycheck) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return name + " " + basePaycheck;
    }
    
    public abstract double calcPaycheck();

}