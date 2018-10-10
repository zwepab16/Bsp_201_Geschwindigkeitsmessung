
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import javax.swing.JOptionPane;

public class VelocityDlg extends javax.swing.JDialog {

    private Measurement m;
    private Boolean ok = false;
    private final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public VelocityDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public boolean isOk() {
        return ok;
    }

    public Measurement getMeasurement() {
        return m;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfDatum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfUhrzeit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfKennzeichen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfGemessen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfErlaubt = new javax.swing.JTextField();
        btÜbernehmen = new javax.swing.JButton();
        btAbbrechen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 2));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Datum: ");
        getContentPane().add(jLabel2);

        tfDatum.setText("08.10.2013");
        getContentPane().add(tfDatum);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Uhrzeit: ");
        getContentPane().add(jLabel3);

        tfUhrzeit.setText("07:55");
        getContentPane().add(tfUhrzeit);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Kennzeichen: ");
        getContentPane().add(jLabel4);

        tfKennzeichen.setText("GU-Raser");
        getContentPane().add(tfKennzeichen);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("V-Gemessen: ");
        getContentPane().add(jLabel5);

        tfGemessen.setText("123");
        getContentPane().add(tfGemessen);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("V-Erlaubt: ");
        getContentPane().add(jLabel6);

        tfErlaubt.setText("80");
        getContentPane().add(tfErlaubt);

        btÜbernehmen.setText("Übernehmen");
        btÜbernehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btÜbernehmenActionPerformed(evt);
            }
        });
        getContentPane().add(btÜbernehmen);

        btAbbrechen.setText("Abbrechen");
        btAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbbrechenActionPerformed(evt);
            }
        });
        getContentPane().add(btAbbrechen);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btÜbernehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btÜbernehmenActionPerformed

        try {
            String strDatum = tfDatum.getText() + " " + tfUhrzeit.getText();

            m = new Measurement(LocalDateTime.parse(strDatum, df), tfKennzeichen.getText(), Integer.parseInt(tfGemessen.getText()), Integer.parseInt(tfErlaubt.getText()));

            ok = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Bitte alle Eingabefelder richig ausfüllen!");
        }
        this.dispose();
    }//GEN-LAST:event_btÜbernehmenActionPerformed

    private void btAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbbrechenActionPerformed

        ok = false;
        this.dispose();
    }//GEN-LAST:event_btAbbrechenActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VelocityDlg dialog = new VelocityDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbbrechen;
    private javax.swing.JButton btÜbernehmen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextField tfErlaubt;
    private javax.swing.JTextField tfGemessen;
    private javax.swing.JTextField tfKennzeichen;
    private javax.swing.JTextField tfUhrzeit;
    // End of variables declaration//GEN-END:variables
}
