package javaapplication5;


public class Tesa extends EmployeUTM {
    private String position;
    private static double bonus = 0.15;
    
    @Override
    public double calcPaycheck() {
        return getBasePaycheck() + getBasePaycheck() * bonus;
    }

    public Tesa(String name, double basePaycheck, String position) {
        super(name, basePaycheck);
        this.position = position;
    }

    public Tesa() {
        super();
        this.position = "";
    }

    public static double getBonus() {
        return bonus;
    }

    public static void setBonus(double bonus) {
        Tesa.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tesa other = (Tesa) obj;
        if ((this.position == null) ? (other.position != null) : !this.position.equals(other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.position != null ? this.position.hashCode() : 0);
        return hash;
    }
    
    public String toString() {
        return super.toString() + " " + position;
    }
}