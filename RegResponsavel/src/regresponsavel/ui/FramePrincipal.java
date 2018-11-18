package regresponsavel.ui;

import javax.swing.*;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
    }
    
    private void atualizarTela(JPanel p) {
        this.setContentPane(p);
        this.setSize(this.getPreferredSize());
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        bmBarraMenu = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCadastrarNovo = new javax.swing.JMenuItem();
        mnVisualizarAlunos = new javax.swing.JMenuItem();
        mnAlterarAlunos = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        mnRelatorioAlunos = new javax.swing.JMenuItem();
        mnRelatorioResponsaveisAluno = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenu();
        mnCadastrarUsuario = new javax.swing.JMenuItem();
        mnAlterarSenha = new javax.swing.JMenuItem();
        mnSuperiorSair = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Registro de Responsáveis");
        setResizable(false);

        mnCadastro.setText("Aluno");

        mnCadastrarNovo.setText("Cadastrar Novo Aluno");
        mnCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarNovoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadastrarNovo);

        mnVisualizarAlunos.setText("Visualizar Alunos");
        mnVisualizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarAlunosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnVisualizarAlunos);

        mnAlterarAlunos.setText("Alterar Cadastro");
        mnAlterarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarAlunosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnAlterarAlunos);

        bmBarraMenu.add(mnCadastro);

        mnRelatorios.setText("Relatórios");

        mnRelatorioAlunos.setText("Relatório de Alunos Registrados");
        mnRelatorios.add(mnRelatorioAlunos);

        mnRelatorioResponsaveisAluno.setText("Relatório de Responsáveis e Alunos");
        mnRelatorios.add(mnRelatorioResponsaveisAluno);

        bmBarraMenu.add(mnRelatorios);

        mnUsuario.setText("Usuário");

        mnCadastrarUsuario.setText("Cadastrar Novo Usuário");
        mnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mnCadastrarUsuario);

        mnAlterarSenha.setText("Alterar Senha");
        mnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarSenhaActionPerformed(evt);
            }
        });
        mnUsuario.add(mnAlterarSenha);

        bmBarraMenu.add(mnUsuario);

        mnSuperiorSair.setText("Outros");

        mnSair.setText("Encerrar");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnSuperiorSair.add(mnSair);

        bmBarraMenu.add(mnSuperiorSair);

        setJMenuBar(bmBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarNovoActionPerformed
        JPanel panel = new PanelCadastrarAluno();
        atualizarTela(panel);
    }//GEN-LAST:event_mnCadastrarNovoActionPerformed

    private void mnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarUsuarioActionPerformed
        JPanel panel = new PanelCadastrarUsuario();
        atualizarTela(panel);
    }//GEN-LAST:event_mnCadastrarUsuarioActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarSenhaActionPerformed
        JPanel panel = new PanelAlterarSenha();
        atualizarTela(panel);
    }//GEN-LAST:event_mnAlterarSenhaActionPerformed

    private void mnVisualizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarAlunosActionPerformed
        JPanel panel = new PanelVisualizarAlunos();
        atualizarTela(panel);
    }//GEN-LAST:event_mnVisualizarAlunosActionPerformed

    private void mnAlterarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarAlunosActionPerformed
        JPanel panel = new PanelAlterarAluno();
        atualizarTela(panel);
    }//GEN-LAST:event_mnAlterarAlunosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmBarraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnAlterarAlunos;
    private javax.swing.JMenuItem mnAlterarSenha;
    private javax.swing.JMenuItem mnCadastrarNovo;
    private javax.swing.JMenuItem mnCadastrarUsuario;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnRelatorioAlunos;
    private javax.swing.JMenuItem mnRelatorioResponsaveisAluno;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenu mnSuperiorSair;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem mnVisualizarAlunos;
    // End of variables declaration//GEN-END:variables
}
