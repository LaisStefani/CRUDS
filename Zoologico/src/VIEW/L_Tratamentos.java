/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author lalam
 */
public class L_Tratamentos extends javax.swing.JFrame {

    /**
     * Creates new form JL_Listar
     */
    public L_Tratamentos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menu1 = new javax.swing.JButton();
        Cadastrar1 = new javax.swing.JButton();
        SAir = new javax.swing.JButton();
        menu3 = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAnimal = new javax.swing.JMenu();
        jMenuHabitat = new javax.swing.JMenu();
        jMenuTratame = new javax.swing.JMenu();
        jMenuveteri = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        LMenuAnimal1 = new javax.swing.JMenu();
        LMenuHabitat1 = new javax.swing.JMenu();
        LMenuTratame1 = new javax.swing.JMenu();
        LMenuveteri1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 370, 240));

        menu1.setBackground(new java.awt.Color(0, 0, 0));
        menu1.setForeground(new java.awt.Color(255, 255, 255));
        menu1.setText("Alterar");
        menu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 73, 23));

        Cadastrar1.setBackground(new java.awt.Color(0, 0, 0));
        Cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar1.setText("Cadastrar");
        Cadastrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 23));

        SAir.setBackground(new java.awt.Color(0, 0, 0));
        SAir.setForeground(new java.awt.Color(255, 255, 255));
        SAir.setText("Sair");
        SAir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAirActionPerformed(evt);
            }
        });
        getContentPane().add(SAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 60, 23));

        menu3.setBackground(new java.awt.Color(0, 0, 0));
        menu3.setForeground(new java.awt.Color(255, 255, 255));
        menu3.setText("Excluir");
        menu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });
        getContentPane().add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 73, 23));

        menu2.setBackground(new java.awt.Color(0, 0, 0));
        menu2.setForeground(new java.awt.Color(255, 255, 255));
        menu2.setText("Selecionar");
        menu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 73, 23));

        jLabel3.setFont(new java.awt.Font("Base 02", 2, 24)); // NOI18N
        jLabel3.setText("Tratamentos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 250, -1));

        jLabel1.setFont(new java.awt.Font("Base 02", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tratamentos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/menu.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jMenu1.setText("Cadastrar");

        jMenuAnimal.setText("Animal");
        jMenuAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAnimalMouseClicked(evt);
            }
        });
        jMenu1.add(jMenuAnimal);

        jMenuHabitat.setText("Habitat");
        jMenuHabitat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHabitatMouseClicked(evt);
            }
        });
        jMenu1.add(jMenuHabitat);

        jMenuTratame.setText("Tratamento");
        jMenuTratame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTratameMouseClicked(evt);
            }
        });
        jMenu1.add(jMenuTratame);

        jMenuveteri.setText("Veterinario");
        jMenuveteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuveteriMouseClicked(evt);
            }
        });
        jMenu1.add(jMenuveteri);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listar");

        LMenuAnimal1.setText("Animal");
        LMenuAnimal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMenuAnimal1MouseClicked(evt);
            }
        });
        jMenu2.add(LMenuAnimal1);

        LMenuHabitat1.setText("Habitat");
        LMenuHabitat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMenuHabitat1MouseClicked(evt);
            }
        });
        jMenu2.add(LMenuHabitat1);

        LMenuTratame1.setText("Tratamento");
        LMenuTratame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMenuTratame1MouseClicked(evt);
            }
        });
        jMenu2.add(LMenuTratame1);

        LMenuveteri1.setText("Veterinario");
        LMenuveteri1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMenuveteri1MouseClicked(evt);
            }
        });
        jMenu2.add(LMenuveteri1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SAirActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu3ActionPerformed

    private void Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar1ActionPerformed

    private void jMenuAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAnimalMouseClicked
        dispose();
        new J_Animal().setVisible(true);
    }//GEN-LAST:event_jMenuAnimalMouseClicked

    private void jMenuHabitatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHabitatMouseClicked
        dispose();
        new J_Habitat().setVisible(true);
    }//GEN-LAST:event_jMenuHabitatMouseClicked

    private void jMenuTratameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTratameMouseClicked
        dispose();
        new J_Tratamentos().setVisible(true);
    }//GEN-LAST:event_jMenuTratameMouseClicked

    private void jMenuveteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuveteriMouseClicked
        dispose();
        new J_Veterinarios().setVisible(true);
    }//GEN-LAST:event_jMenuveteriMouseClicked

    private void LMenuAnimal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMenuAnimal1MouseClicked
        dispose();
        new L_Animal().setVisible(true);
    }//GEN-LAST:event_LMenuAnimal1MouseClicked

    private void LMenuHabitat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMenuHabitat1MouseClicked
        dispose();
        new L_Habitat().setVisible(true);
    }//GEN-LAST:event_LMenuHabitat1MouseClicked

    private void LMenuTratame1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMenuTratame1MouseClicked
        dispose();
        new L_Tratamentos().setVisible(true);
    }//GEN-LAST:event_LMenuTratame1MouseClicked

    private void LMenuveteri1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMenuveteri1MouseClicked
        dispose();
        new L_Veterinarios().setVisible(true);
    }//GEN-LAST:event_LMenuveteri1MouseClicked

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
            java.util.logging.Logger.getLogger(L_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L_Tratamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar1;
    private javax.swing.JMenu LMenuAnimal1;
    private javax.swing.JMenu LMenuHabitat1;
    private javax.swing.JMenu LMenuTratame1;
    private javax.swing.JMenu LMenuveteri1;
    private javax.swing.JButton SAir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAnimal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHabitat;
    private javax.swing.JMenu jMenuTratame;
    private javax.swing.JMenu jMenuveteri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton menu1;
    private javax.swing.JButton menu2;
    private javax.swing.JButton menu3;
    // End of variables declaration//GEN-END:variables
}