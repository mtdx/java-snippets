
package InterfataGrafica;


public class IntroducereDate extends javax.swing.JPanel {

    Candidat ob = null;
    public IntroducereDate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Nord = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeCandidat = new javax.swing.JTextField();
        Sud = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        Centru = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        experienta = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        butonda = new javax.swing.JRadioButton();
        butonnu = new javax.swing.JRadioButton();
        est = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        engleza = new javax.swing.JCheckBox();
        franceza = new javax.swing.JCheckBox();
        chineza = new javax.swing.JCheckBox();
        germana = new javax.swing.JCheckBox();
        maghiara = new javax.swing.JCheckBox();
        vest = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        limbajeprog = new javax.swing.JList();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nume");
        Nord.add(jLabel1);

        numeCandidat.setPreferredSize(new java.awt.Dimension(200, 20));
        numeCandidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeCandidatActionPerformed(evt);
            }
        });
        Nord.add(numeCandidat);

        add(Nord, java.awt.BorderLayout.NORTH);

        save.setText("Salvare");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Sud.add(save);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        Sud.add(cancel);

        add(Sud, java.awt.BorderLayout.SOUTH);

        Centru.setLayout(new javax.swing.BoxLayout(Centru, javax.swing.BoxLayout.Y_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Experienta");
        Centru.add(jLabel5);

        experienta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incepator", "Intermediar", "Avansat", " " }));
        experienta.setLightWeightPopupEnabled(false);
        experienta.setMaximumSize(new java.awt.Dimension(300, 20));
        Centru.add(experienta);
        Centru.add(jSeparator1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Absolvent");
        Centru.add(jLabel4);

        butonda.setText("Da");
        Centru.add(butonda);

        butonnu.setText("Nu");
        Centru.add(butonnu);

        add(Centru, java.awt.BorderLayout.CENTER);

        est.setLayout(new javax.swing.BoxLayout(est, javax.swing.BoxLayout.Y_AXIS));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Limibi Straine");
        est.add(jLabel3);

        engleza.setText("engleza");
        engleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englezaActionPerformed(evt);
            }
        });
        est.add(engleza);

        franceza.setText("franceza");
        est.add(franceza);

        chineza.setText("chineza");
        est.add(chineza);

        germana.setText("germana");
        est.add(germana);

        maghiara.setText("maghiara");
        est.add(maghiara);

        add(est, java.awt.BorderLayout.EAST);

        vest.setLayout(new javax.swing.BoxLayout(vest, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Limbaje De Programare");
        vest.add(jLabel2);

        limbajeprog.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "C\\C++", "Java", "PHP", "Python", "C#", "Perl", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(limbajeprog);

        vest.add(jScrollPane1);

        add(vest, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

    private void numeCandidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeCandidatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeCandidatActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void englezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_englezaActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        ob.setNume(numeCandidat.getText());
        
        
    }//GEN-LAST:event_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Centru;
    private javax.swing.JPanel Nord;
    private javax.swing.JPanel Sud;
    private javax.swing.JRadioButton butonda;
    private javax.swing.JRadioButton butonnu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox chineza;
    private javax.swing.JCheckBox engleza;
    private javax.swing.JPanel est;
    private javax.swing.JComboBox experienta;
    private javax.swing.JCheckBox franceza;
    private javax.swing.JCheckBox germana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList limbajeprog;
    private javax.swing.JCheckBox maghiara;
    private javax.swing.JTextField numeCandidat;
    private javax.swing.JButton save;
    private javax.swing.JPanel vest;
    // End of variables declaration//GEN-END:variables
}
