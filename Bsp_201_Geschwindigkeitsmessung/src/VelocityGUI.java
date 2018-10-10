
import javax.swing.JFrame;


public class VelocityGUI extends javax.swing.JFrame {
VelocityTableModel model=new VelocityTableModel();
  
    public VelocityGUI() {
        initComponents();
       
      table.setModel(model);
       
        table.setDefaultRenderer(Object.class, new VelocityTableRenderer());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miAdd = new javax.swing.JMenuItem();
        miLöschen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miDurchschnitt = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btAdd = new javax.swing.JMenuItem();

        miAdd.setText("Hinzufügen");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miAdd);

        miLöschen.setText("Löschen");
        miLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLöschenActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miLöschen);
        jPopupMenu1.add(jSeparator1);

        miDurchschnitt.setText("Durchschnitt");
        jPopupMenu1.add(miDurchschnitt);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geschwindigkeitsmessungen");

        jScrollPane1.setComponentPopupMenu(jPopupMenu1);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setComponentPopupMenu(jPopupMenu1);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Messungen");

        jMenu1.setText("Datei");

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jMenu1.add(btAdd);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
  JFrame frame = new JFrame();
        VelocityDlg dialog = new VelocityDlg(frame, true);
        dialog.setVisible(true);
        if(dialog.isOk()){
            model.add(dialog.getMeasurement());
        }
    }//GEN-LAST:event_miAddActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
       JFrame frame = new JFrame();
        VelocityDlg dialog = new VelocityDlg(frame, true);
        dialog.setVisible(true);
        if(dialog.isOk()){
            model.add(dialog.getMeasurement());
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void miLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLöschenActionPerformed
 int zeile=  table.getSelectedRow();
        model.remove(zeile);
    }//GEN-LAST:event_miLöschenActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
    }//GEN-LAST:event_tableMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VelocityGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miDurchschnitt;
    private javax.swing.JMenuItem miLöschen;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
