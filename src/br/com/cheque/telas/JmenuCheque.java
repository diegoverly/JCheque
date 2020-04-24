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
        jconsEmpresa = new javax.swing.JMenuItem();
        jConsBancosEmp = new javax.swing.JMenuItem();
        jConsFavor = new javax.swing.JMenuItem();
        jConsMovCheque = new javax.swing.JMenuItem();
        jConsRedeBancos = new javax.swing.JMenuItem();
        jCadVerso = new javax.swing.JMenuItem();
        jRelatorios = new javax.swing.JMenu();
        jRelEmpresa = new javax.swing.JMenuItem();
        jRelCadBancos = new javax.swing.JMenuItem();
        jRelFavorecidos = new javax.swing.JMenuItem();
        jRelMovCheque = new javax.swing.JMenuItem();
        jRelRededeBancos = new javax.swing.JMenuItem();
        jRelCadVerso = new javax.swing.JMenuItem();
        jRelEmissaoCheque = new javax.swing.JMenuItem();
        jRelFechamentoCh = new javax.swing.JMenuItem();
        jFerramentas = new javax.swing.JMenu();
        jFerr_Backup = new javax.swing.JMenuItem();
        jParametos = new javax.swing.JMenuItem();
        jFerrImportacao = new javax.swing.JMenuItem();
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
        jRedeBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRedeBancosActionPerformed(evt);
            }
        });
        jArquivo.add(jRedeBancos);

        jverso.setText("Cheques Padrão Verso");
        jArquivo.add(jverso);

        jMenuBar1.add(jArquivo);

        jConsultas.setText("Consultas");

        jconsEmpresa.setText("Empresa");
        jConsultas.add(jconsEmpresa);

        jConsBancosEmp.setText("Bancos da Empresa");
        jConsultas.add(jConsBancosEmp);

        jConsFavor.setText("Favorecidos");
        jConsultas.add(jConsFavor);

        jConsMovCheque.setText("Movimentos de Cheques");
        jConsultas.add(jConsMovCheque);

        jConsRedeBancos.setText("Rede de Bancos");
        jConsultas.add(jConsRedeBancos);

        jCadVerso.setText("Padrão Versos do Cheque");
        jConsultas.add(jCadVerso);

        jMenuBar1.add(jConsultas);

        jRelatorios.setText("Relatorios");

        jRelEmpresa.setText("Empresas");
        jRelatorios.add(jRelEmpresa);

        jRelCadBancos.setText("Bancos da Empresa");
        jRelatorios.add(jRelCadBancos);

        jRelFavorecidos.setText("Favorecidos");
        jRelatorios.add(jRelFavorecidos);

        jRelMovCheque.setText("Movimentação de Cheques");
        jRelatorios.add(jRelMovCheque);

        jRelRededeBancos.setText("Rede de Bancos");
        jRelatorios.add(jRelRededeBancos);

        jRelCadVerso.setText("Cadastro de Versos");
        jRelatorios.add(jRelCadVerso);

        jRelEmissaoCheque.setText("Emissão de Cheques");
        jRelEmissaoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelEmissaoChequeActionPerformed(evt);
            }
        });
        jRelatorios.add(jRelEmissaoCheque);

        jRelFechamentoCh.setText("Fechamento de Cheques");
        jRelatorios.add(jRelFechamentoCh);

        jMenuBar1.add(jRelatorios);

        jFerramentas.setText("Ferramentas");

        jFerr_Backup.setText("Backup");
        jFerramentas.add(jFerr_Backup);

        jParametos.setText("Parametos do Sistema");
        jFerramentas.add(jParametos);

        jFerrImportacao.setText("Importação Clientes");
        jFerramentas.add(jFerrImportacao);

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
            .addGap(0, 1203, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1219, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Chamaempresa() {

        jTelaCadEmpresa cadempresa = new jTelaCadEmpresa(new javax.swing.JFrame(), true);
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

    private void Rede_bancos() {
        jRedeBancos Rede_bancos = new jRedeBancos();
        Rede_bancos.setVisible(true);
    }

    private void Emissao_Cheque() {
        jEmissaoCh Emissao_Cheque = new jEmissaoCh();
        Emissao_Cheque.setVisible(true);

    }

    private void sair_aplic() {
        int sair = JOptionPane.showConfirmDialog(null, "tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }


    private void jEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEmpresaKeyPressed

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

    private void jRedeBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRedeBancosActionPerformed
        // comando abixo chama a tela jRedeBancos
        Rede_bancos();
    }//GEN-LAST:event_jRedeBancosActionPerformed

    private void jRelEmissaoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelEmissaoChequeActionPerformed
        // comando abaixo chama tela emissão cheque

        Emissao_Cheque();
    }//GEN-LAST:event_jRelEmissaoChequeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jArquivo;
    private javax.swing.JMenuItem jCadBancoEmp;
    private javax.swing.JMenuItem jCadVerso;
    private javax.swing.JMenuItem jConsBancosEmp;
    private javax.swing.JMenuItem jConsFavor;
    private javax.swing.JMenuItem jConsMovCheque;
    private javax.swing.JMenuItem jConsRedeBancos;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuItem jEmpresa;
    private javax.swing.JMenuItem jFavorecidos;
    private javax.swing.JMenuItem jFerrImportacao;
    private javax.swing.JMenuItem jFerr_Backup;
    private javax.swing.JMenu jFerramentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMovCheque;
    private javax.swing.JMenuItem jParametos;
    private javax.swing.JMenuItem jRedeBancos;
    private javax.swing.JMenuItem jRelCadBancos;
    private javax.swing.JMenuItem jRelCadVerso;
    private javax.swing.JMenuItem jRelEmissaoCheque;
    private javax.swing.JMenuItem jRelEmpresa;
    private javax.swing.JMenuItem jRelFavorecidos;
    private javax.swing.JMenuItem jRelFechamentoCh;
    private javax.swing.JMenuItem jRelMovCheque;
    private javax.swing.JMenuItem jRelRededeBancos;
    private javax.swing.JMenu jRelatorios;
    private javax.swing.JMenu jSair;
    private javax.swing.JMenuItem jconsEmpresa;
    private javax.swing.JMenuItem jverso;
    // End of variables declaration//GEN-END:variables
}
