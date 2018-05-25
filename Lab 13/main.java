
package javaapplication1;

import java.util.Collection;
import java.util.Function;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;        
import java.sql.*;
import java.servlet.*;

public class JavaApplication1 {

   
    public static void main(String[] args) {
        // Subiectul 2. (serializarem colectii de obiecte, citire date din fisier)
        // nu ne da despre stream-uri dar poate cu citire din fisiere.
        
        List<Automobil> l = new ArrayList<>();
        List<Automobil> l2 = new ArrayList<>();
        
        l.add(new Automobil("seat", "ibiza", 1400, 5054.72));
        l.add(new Automobil("logan", "dacia", 1800, 5054.72));
        l.add(new Automobil("rx8", "mazda", 2400, 25054.72));
        
        Predicate<Automobil> c = ob -> ob.getPret() => 5000;
        for (Automobil it : l) {
            if (c.text(it)) {
                l2.add(it);
            }
        }
        Collections.sort(l2, (a, b) -> b.getPret() - a.getPret());
        l2.foreach(System.out::println)
        
        
        // Subiectul 3. (serializarem colectii de obiecte, citire date din fisier)
        // fisier.txt => frecventa de apartie a cuvantului
        // pas1 se poarnesc mai multe dire de ex. de acelasi tip metoda 1, o clasa
        // care extinde Thread,  sau o clasa care implenteaza Runnable public void run() {}
        class Fir extends Thread {
            private String numeFisier;
            private String cuv;
            private int nrAparitii; // camp calculat 
            
            public Fir(String numeFisier, String cuv) {
                    this.numeFisier = numeFisier;
                    this.cuv =  cuv;
                    this.nrAparitii = 0;
            }
            
            @Override
            public void run() {
                try {
                    Scanner fin = new Scanner(new File(numeFisier));
                    String linie;

                    while(fin.hasNextLine()) {
                        linie = fin.nextLine();
                        String[] ta = linie.split("[ ,!?.]+");
                        for (String it : ta) {
                            if (it.equals(cuv)) {
                                this.nrAparitii++;
                            }
                        }
                    }
                } catch(IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
            int getNrAparitii() {
                return nrAparitii;
            }
        }
        
        
        public class Subiect3 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String cuv = in.next();
                
                Fir f1 = new Fir("exp1.txt", cuv);
                Fir f2 = new Fir("exp2.txt", cuv);
                Fir f3 = new Fir("exp3.txt", cuv);
                
                f1.start(); 
                f1.join();
                
                f2.start();
                f2.join();
                
                f3.start();
                f3.join();
                
                
                int t = f1.getNrAparitii() + f2.getNrAparitii() + f3.getNrAparitii();
                System.out.println("Total " + t);
            }
        }
        
        
         // Subiectul 4. init, service() -> doGet, destroy
        /* fisiere, serializare, colectii de dfate, conexiune BD, servlet, fire executare, String */
        public class ApWeb extends HTTPServlet {
              
              Connection conn = null;
            
               public void init() {
                    conn = DriverManager.getConnection("jdbc....");
                }
               
               protected void doGet(HTTPServletRequest cer, HTTPServletResponse ras) {
                   PrintWriter fout = ras.getWriter();
                   fout.println("<html>");
                   fout.println("<body>");
                   
                   String sql = "SELECT * FROM DateAngajati WHERE salariu >= ?";
                   PreparedStatement pst = conn.prepareStatement(sql);
                   double min = Double.parseDouble(cer.getParameter("min"));
                   pst.setDouble(1, min);
                   
                   ResultSet rez = pst.executeQuery();
                   while(rez.next()) {
                       fout.println(rez.getString("cnp") + " " + rez.getString("Nume") + .....);
                   }
                   
                   fout.println("</body>");
                   fout.println("</html>");
               }
        }
        
    }
}