package regresponsavel.bd;

import regresponsavel.model.UsuarioModel;

public interface IUsuarioDAO {
    
    public abstract void cadastrarUsuario(UsuarioModel u);
    
    public abstract void alterarSenha(UsuarioModel u);
            
    public abstract boolean autenticarUsuario(String prontuario, String senha);
    
    public UsuarioModel obterUsuario(String prontuario);
}
