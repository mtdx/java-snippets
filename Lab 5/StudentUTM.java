package javaapplication9;

public class StudentUTM {
    private String name, fname;
    private int year;
    private static String univ = "UTM";

    public StudentUTM() {
        this("###", "####", 0);
    }

    public StudentUTM(String name, String fname, int year) {
        this.name = name;
        this.fname = fname;
        this.year = year;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUniv() {
        return univ;
    }

    public static void setUniv(String univ) {
        StudentUTM.univ = univ;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentUTM other = (StudentUTM) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.fname == null) ? (other.fname != null) : !this.fname.equals(other.fname)) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.fname != null ? this.fname.hashCode() : 0);
        hash = 37 * hash + this.year;
        return hash;
    }

    @Override
    public String toString() {
        return name + " " + fname + " " + year;
    }
}
