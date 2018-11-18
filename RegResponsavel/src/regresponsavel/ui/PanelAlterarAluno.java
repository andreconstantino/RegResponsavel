package regresponsavel.ui;

public class PanelAlterarAluno extends PanelAbstractAluno {

    public PanelAlterarAluno() {
        super();
        lbTitulo.setText("Alterar Cadastro do Aluno");
        btAbstract.setText("Alterar");
        tfProntuario.setEnabled(false);
    }

    @Override
    public void acaoAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
