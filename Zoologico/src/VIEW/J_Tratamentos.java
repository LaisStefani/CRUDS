/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author NIDE08
 */
public class J_Tratamentos extends javax.swing.JFrame {

    /**
     * Creates new form J_Tratamentos
     */
    public J_Tratamentos() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textProcedimento = new javax.swing.JTextField();
        idAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idVet = new javax.swing.JTextField();
        menu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescricao = new javax.swing.JTextArea();
        Cadastrar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Procedimento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Animal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Base 02", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tratamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, 60));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Veterinario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        getContentPane().add(textProcedimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 280, -1));
        getContentPane().add(idAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 280, -1));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        getContentPane().add(idVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 280, -1));

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menu");
        menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 73, 23));

        areaDescricao.setColumns(20);
        areaDescricao.setRows(5);
        jScrollPane1.setViewportView(areaDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 280, -1));

        Cadastrar1.setBackground(new java.awt.Color(0, 0, 0));
        Cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar1.setText("Cadastrar");
        Cadastrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 73, 23));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/tratamentos.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 490));

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

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        dispose();
        new J_MenuInicial().setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(J_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_Tratamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new J_Tratamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar1;
    private javax.swing.JMenu LMenuAnimal1;
    private javax.swing.JMenu LMenuHabitat1;
    private javax.swing.JMenu LMenuTratame1;
    private javax.swing.JMenu LMenuveteri1;
    private javax.swing.JTextArea areaDescricao;
    private javax.swing.JTextField idAnimal;
    private javax.swing.JTextField idVet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAnimal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHabitat;
    private javax.swing.JMenu jMenuTratame;
    private javax.swing.JMenu jMenuveteri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField textProcedimento;
    // End of variables declaration//GEN-END:variables
}