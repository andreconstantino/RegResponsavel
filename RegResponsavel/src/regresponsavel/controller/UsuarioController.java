package regresponsavel.controller;

import regresponsavel.bd.UsuarioDAO;
import regresponsavel.model.UsuarioModel;

public class UsuarioController {

    private final UsuarioDAO dao = new UsuarioDAO();
    
    public UsuarioController() {
        
    }

    public void cadastrar(UsuarioModel u) {
        dao.cadastrarUsuario(u);
    }

    public void alterar(UsuarioModel u) {
        dao.alterarSenha(u);
    }

    public boolean autenticar(String prontuario, String senha) {
        return dao.autenticarUsuario(prontuario, senha);
    }    
    
    public UsuarioModel obter(String prontuario) {
        return dao.obterUsuario(prontuario);
    }
}
