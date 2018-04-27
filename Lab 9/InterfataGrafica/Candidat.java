
package InterfataGrafica;

import java.util.ArrayList;


public class Candidat {
    String nume;
    ArrayList<String> limbage;
    ArrayList<String> limbiStraine;
    boolean absolvent;
    String nivel;

    public Candidat(String nume, ArrayList<String> limbage, ArrayList<String> limbiStraine, boolean absolvent, String nivel) {
        this.nume = nume;
        this.limbage = limbage;
        this.limbiStraine = limbiStraine;
        this.absolvent = absolvent;
        this.nivel = nivel;
    }

    public Candidat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<String> getLimbage() {
        return limbage;
    }

    public void setLimbage(ArrayList<String> limbage) {
        this.limbage = limbage;
    }

    public ArrayList<String> getLimbiStraine() {
        return limbiStraine;
    }

    public void setLimbiStraine(ArrayList<String> limbiStraine) {
        this.limbiStraine = limbiStraine;
    }

    public boolean isAbsolvent() {
        return absolvent;
    }

    public void setAbsolvent(boolean absolvent) {
        this.absolvent = absolvent;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Candidat{" + "nume=" + nume + ", limbage=" + limbage + ", limbiStraine=" + limbiStraine + ", absolvent=" + absolvent + ", nivel=" + nivel + '}';
    }
    
    
    
}
