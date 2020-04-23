/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cheque.telas;

import javax.swing.JOptionPane;

public class JmenuCheque extends javax.swing.JFrame {

    public JmenuCheque() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jArquivo = new javax.swing.JMenu();
        jEmpresa = new javax.swing.JMenuItem();
        jCadBancoEmp = new javax.swing.JMenuItem();
        jFavorecidos = new javax.swing.JMenuItem();
        jMovCheque = new javax.swing.JMenuItem();
        jRedeBancos = new javax.swing.JMenuItem();
        jverso = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jRelatorios = new javax.swing.JMenu();
        jFerramentas = new javax.swing.JMenu();
        jSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setForeground(java.awt.Color.orange);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jArquivo.setText("Arquivo");

        jEmpresa.setText("Empresa");
        jEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpresaActionPerformed(evt);
            }
        });
        jEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEmpresaKeyPressed(evt);
            }
        });
        jArquivo.add(jEmpresa);

        jCadBancoEmp.setText("Bancos Empresa");
        jCadBancoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadBancoEmpActionPerformed(evt);
            }
        });
        jArquivo.add(jCadBancoEmp);

        jFavorecidos.setText("Favorecidos");
        jFavorecidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFavorecidosActionPerformed(evt);
            }
        });
        jArquivo.add(jFavorecidos);

        jMovCheque.setText("Movimentos de Cheque");
        jMovCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMovChequeActionPerformed(evt);
            }
        });
        jArquivo.add(jMovCheque);

        jRedeBancos.setText("Rede de Bancos");
        jArquivo.add(jRedeBancos);

        jverso.setText("Cheques Padrão Verso");
        jArquivo.add(jverso);

        jMenuBar1.add(jArquivo);

        jConsultas.setText("Consultas");
        jMenuBar1.add(jConsultas);

        jRelatorios.setText("Relatorios");
        jMenuBar1.add(jRelatorios);

        jFerramentas.setText("Ferramentas");
        jMenuBar1.add(jFerramentas);

        jSair.setText("Sair ");
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1189, 813));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Chamaempresa() {

        jTelaCadEmpresa cadempresa = new jTelaCadEmpresa(new javax.swing.JFrame(), true);
        cadempresa.addWindowListener(new java.awt.event.WindowAdapter() {
                    });
        cadempresa.setVisible(true);

    }

    private void ChamaBancoEmp() {
        jTelaBancoEmp cadbcoemp = new jTelaBancoEmp();
        cadbcoemp.setVisible(true);
    }

    private void ChamaFavor() {
        jTelaFavor CadFavor = new jTelaFavor();
        CadFavor.setVisible(true);

    }

    private void ChamaMovch() {
        jTelaMovch cadmovch = new jTelaMovch();
        cadmovch.setVisible(true);
    }

    private void sair_aplic() {
        int sair = JOptionPane.showConfirmDialog(null, "tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }


    private void jEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEmpresaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmpresaKeyPressed

    private void jEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpresaActionPerformed
        // comando a baixo chama a tela de empresa 
        Chamaempresa();
    }//GEN-LAST:event_jEmpresaActionPerformed

    private void jCadBancoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadBancoEmpActionPerformed
        // comando abaixo chama a tela banco da empresa
        ChamaBancoEmp();
    }//GEN-LAST:event_jCadBancoEmpActionPerformed

    private void jFavorecidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFavorecidosActionPerformed
        // comando abaixo chama a tela de favorecidos
        ChamaFavor();
    }//GEN-LAST:event_jFavorecidosActionPerformed

    private void jMovChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMovChequeActionPerformed

        //comando abaixo chama a tela de Movimento de cheques
        ChamaMovch();
    }//GEN-LAST:event_jMovChequeActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed


    }//GEN-LAST:event_jSairActionPerformed

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked

        sair_aplic();
    }//GEN-LAST:event_jSairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jArquivo;
    private javax.swing.JMenuItem jCadBancoEmp;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuItem jEmpresa;
    private javax.swing.JMenuItem jFavorecidos;
    private javax.swing.JMenu jFerramentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMovCheque;
    private javax.swing.JMenuItem jRedeBancos;
    private javax.swing.JMenu jRelatorios;
    private javax.swing.JMenu jSair;
    private javax.swing.JMenuItem jverso;
    // End of variables declaration//GEN-END:variables

   
}
