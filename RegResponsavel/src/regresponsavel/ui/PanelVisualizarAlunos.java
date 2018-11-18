package regresponsavel.ui;

public class PanelVisualizarAlunos extends javax.swing.JPanel {

    public PanelVisualizarAlunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btOrdenarProntuario = new javax.swing.JButton();
        btOrdenarResponsavel = new javax.swing.JButton();
        btOrdenarNome = new javax.swing.JButton();
        btAlterarAluno = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbProcurar = new javax.swing.JLabel();
        btProcurarAluno = new javax.swing.JButton();
        tfProntuarioProcurar = new javax.swing.JTextField();
        jsBarraRolagem = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Visualização de Alunos");

        btOrdenarProntuario.setText("Ordernar por Prontuário");
        btOrdenarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarProntuarioActionPerformed(evt);
            }
        });

        btOrdenarResponsavel.setText("Ordernar por Responsável");
        btOrdenarResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarResponsavelActionPerformed(evt);
            }
        });

        btOrdenarNome.setText("Ordernar por Nome");
        btOrdenarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarNomeActionPerformed(evt);
            }
        });

        btAlterarAluno.setText("Alterar");
        btAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarAlunoActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbProcurar.setText("Prontuário do Aluno a Procurar:");

        btProcurarAluno.setText("Procurar");
        btProcurarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarAlunoActionPerformed(evt);
            }
        });

        tfProntuarioProcurar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Prontuário", "Nome", "Responsável"
            }
        ));
        jsBarraRolagem.setViewportView(tbAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbProcurar)
                            .addGap(18, 18, 18)
                            .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btProcurarAluno))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btOrdenarNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btOrdenarProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btOrdenarResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(142, 142, 142)
                            .addComponent(btAlterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jsBarraRolagem)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProcurar)
                    .addComponent(btProcurarAluno)
                    .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jsBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOrdenarProntuario)
                    .addComponent(btRemover)
                    .addComponent(btAlterarAluno))
                .addGap(18, 18, 18)
                .addComponent(btOrdenarNome)
                .addGap(16, 16, 16)
                .addComponent(btOrdenarResponsavel)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btOrdenarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarProntuarioActionPerformed

    }//GEN-LAST:event_btOrdenarProntuarioActionPerformed

    private void btOrdenarResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarResponsavelActionPerformed

    }//GEN-LAST:event_btOrdenarResponsavelActionPerformed

    private void btOrdenarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarNomeActionPerformed

    }//GEN-LAST:event_btOrdenarNomeActionPerformed

    private void btAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarAlunoActionPerformed

    }//GEN-LAST:event_btAlterarAlunoActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed

    }//GEN-LAST:event_btRemoverActionPerformed

    private void btProcurarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarAlunoActionPerformed

    }//GEN-LAST:event_btProcurarAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarAluno;
    private javax.swing.JButton btOrdenarNome;
    private javax.swing.JButton btOrdenarProntuario;
    private javax.swing.JButton btOrdenarResponsavel;
    private javax.swing.JButton btProcurarAluno;
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane jsBarraRolagem;
    private javax.swing.JLabel lbProcurar;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JTextField tfProntuarioProcurar;
    // End of variables declaration//GEN-END:variables
}
