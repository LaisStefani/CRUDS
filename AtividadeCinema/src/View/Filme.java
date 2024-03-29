/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller_Filme;
import DAO.FilmeDAO;
import MODEL.Tbl_Filme;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lalam
 */
public class Filme extends javax.swing.JFrame {

    /**
     * Creates new form Filme
     */
    public Filme() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFilmeEN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFilmeduracao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFilmeLan = new javax.swing.JTextField();
        jTextFilmePT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFilmeDi1 = new javax.swing.JTextField();
        jTextFilmege2 = new javax.swing.JTextField();
        DiretorF = new javax.swing.JLabel();
        generoF = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 52, 57));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadastrar Filme");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(102, 35, 157, 26);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(304, 435, 63, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/guia.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(317, 11, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/filme.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 67, 100, 100);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("      Filme");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 173, 100, 20);
        jPanel1.add(jTextFilmeEN);
        jTextFilmeEN.setBounds(155, 267, 195, 25);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Filme EN:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(48, 265, 74, 21);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Duração");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(48, 298, 62, 21);

        jTextFilmeduracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFilmeduracaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFilmeduracao);
        jTextFilmeduracao.setBounds(155, 300, 195, 25);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Lancamento:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(48, 331, 97, 21);
        jPanel1.add(jTextFilmeLan);
        jTextFilmeLan.setBounds(155, 333, 195, 25);

        jTextFilmePT.setMinimumSize(new java.awt.Dimension(10, 20));
        jPanel1.add(jTextFilmePT);
        jTextFilmePT.setBounds(155, 235, 195, 25);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filme PT:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(48, 233, 72, 21);
        jPanel1.add(jTextFilmeDi1);
        jTextFilmeDi1.setBounds(300, 380, 50, 25);
        jPanel1.add(jTextFilmege2);
        jTextFilmege2.setBounds(150, 380, 50, 25);

        DiretorF.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DiretorF.setForeground(new java.awt.Color(255, 255, 255));
        DiretorF.setText("Diretor:");
        jPanel1.add(DiretorF);
        DiretorF.setBounds(220, 380, 57, 21);

        generoF.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        generoF.setForeground(new java.awt.Color(255, 255, 255));
        generoF.setText("Genero:");
        jPanel1.add(generoF);
        generoF.setBounds(50, 380, 59, 21);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 377, 470));

        jMenu1.setText("Menu");

        jMenu3.setText("Ator");
        jMenu1.add(jMenu3);

        jMenu4.setText("Diretor");
        jMenu1.add(jMenu4);

        jMenu6.setText("Filme");
        jMenu1.add(jMenu6);

        jMenu10.setText("Genero");
        jMenu1.add(jMenu10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Voltar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller.Controller_Filme f = new Controller_Filme();

        if ((jTextFilmePT.getText().isEmpty()) || (jTextFilmeEN.getText().isEmpty()) || jTextFilmeduracao.getText().isEmpty() || (jTextFilmeLan.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os dados não podem retornar vazio");
        } else {
            try {
                f.salvar(jTextFilmeEN.getText(),
                jTextFilmePT.getText(),
                jTextFilmeLan.getText(), 
                Integer.parseInt(jTextFilmeduracao.getText()),
                Integer.parseInt(jTextFilmege2.getText()),
                Integer.parseInt(jTextFilmeDi1.getText())
                );
            } catch (SQLException ex) {
                Logger.getLogger(Filme.class.getName()).log(Level.SEVERE, null, ex);
                // erro de tipo de dado recebido(variavel) 
            } catch (ParseException ex) {
                Logger.getLogger(Filme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        jTextFilmeEN.setText("");
        jTextFilmePT.setText("");
        jTextFilmeLan.setText("");
        jTextFilmeduracao.setText("");
        jTextFilmeDi1.setText("");
        jTextFilmege2.setText("");        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jTextFilmeduracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFilmeduracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFilmeduracaoActionPerformed

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
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DiretorF;
    private javax.swing.JLabel generoF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFilmeDi1;
    private javax.swing.JTextField jTextFilmeEN;
    private javax.swing.JTextField jTextFilmeLan;
    private javax.swing.JTextField jTextFilmePT;
    private javax.swing.JTextField jTextFilmeduracao;
    private javax.swing.JTextField jTextFilmege2;
    // End of variables declaration//GEN-END:variables
}
