/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author naufa
 */
public class viewlatihan3 extends javax.swing.JFrame {

    /**
     * Creates new form viewlatihan3
     */
    public viewlatihan3() {
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

        buttonGroup11 = new javax.swing.ButtonGroup();
        selek = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        teks = new javax.swing.JTextArea();
        tombol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teksnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        button1 = new javax.swing.JRadioButton();
        button2 = new javax.swing.JRadioButton();
        box1 = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK INFORMATIKA", "AKINUTANSI", "SISTEM INFORMASI", "TEKNIK KOMPUTER", "BAHASA INGGRIS", "DESAIN KOMUNIKASI VISUAL" }));
        selek.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        teks.setBackground(new java.awt.Color(204, 204, 204));
        teks.setColumns(20);
        teks.setRows(5);
        jScrollPane1.setViewportView(teks);

        tombol.setText("Simpan");
        tombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolActionPerformed(evt);
            }
        });

        jLabel1.setText("APLIKASI PENDATAAN VOLUNTEER DEV SUMMIT");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        buttonGroup11.add(button1);
        button1.setText("Male");

        buttonGroup11.add(button2);
        button2.setText("Female");

        box1.setText("Programming");
        box1.setName("Programming"); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setText("Design UI UIX");
        box2.setName("Design UI UIX"); // NOI18N

        box3.setText("Game");
        box3.setName("Game"); // NOI18N

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dev Summit Bandung", "Dev Summit Jakarta", "Dev Summit Surabaya", "Dev Summit Yogyakarta" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list);

        jLabel4.setText("Jurusan");

        jLabel5.setText("Minat");

        jLabel6.setText("Alamat Penempatan");

        jLabel7.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2)
                            .addComponent(button1)
                            .addComponent(box3)
                            .addComponent(box2)
                            .addComponent(box1)
                            .addComponent(tombol, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teksnama, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(teksnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(button1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(selek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(box2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box3)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol)
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolActionPerformed
        // TODO add your handling code here:
        Object o = selek.getSelectedItem();

        String k = String.valueOf(o);
        String f = null;
        if (button1.isSelected()) {
            f = "Male";
        } else if (button2.isSelected()) {
            f = "Female";
        }
        if (box1.isSelected() == false) {
            box1.setName("");
        }

        if (box2.isSelected() == false) {
            box2.setName("");
        }
        if (box3.isSelected() == false) {
            box3.setName("");
        }       

        teks.setText("Nama: "+teksnama.getText()+"\n"+
                "Jenis Kelamin: "+f + "\n" + "Jurusan: "+
                k + "\n"+"Minat: "+box1.getName()+" "+box2.getName()+
                " "+box3.getName()+"\n"+"Kota Penempatan: "+list.getSelectedValue());

    }//GEN-LAST:event_tombolActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewlatihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewlatihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewlatihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewlatihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewlatihan3().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.JRadioButton button1;
    private javax.swing.JRadioButton button2;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JComboBox<String> selek;
    private javax.swing.JTextArea teks;
    private javax.swing.JTextField teksnama;
    private javax.swing.JButton tombol;
    // End of variables declaration//GEN-END:variables

}
