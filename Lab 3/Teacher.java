package javaapplication5;


public class Teacher extends EmployeUTM {
    private String course;
    private double coursePay;
    private int nrCourses;

    public Teacher(String name, double basePaycheck, String course, double coursePay, int nrCourses) {
        super(name, basePaycheck);
        this.course = course;
        this.coursePay = coursePay;
        this.nrCourses = nrCourses;
    }

    public Teacher() {
        this("name", 0.0, "course", 0.0, 0);
    }
    
    
    @Override
    public double calcPaycheck() {
        return this.getBasePaycheck() + this.nrCourses * this.coursePay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCoursePay() {
        return coursePay;
    }

    public void setCoursePay(double coursePay) {
        this.coursePay = coursePay;
    }

    public int getNrCourses() {
        return nrCourses;
    }

    public void setNrCourses(int nrCourses) {
        this.nrCourses = nrCourses;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if ((this.course == null) ? (other.course != null) : !this.course.equals(other.course)) {
            return false;
        }
        if (this.coursePay != other.coursePay) {
            return false;
        }
        if (this.nrCourses != other.nrCourses) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.course != null ? this.course.hashCode() : 0);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.coursePay) ^ (Double.doubleToLongBits(this.coursePay) >>> 32));
        hash = 31 * hash + this.nrCourses;
        return hash;
    }
    
    @Override
    public String toString() {
        return super.toString() +  " " + this.course  + " " + this.nrCourses + " " + this.coursePay;
    }
}