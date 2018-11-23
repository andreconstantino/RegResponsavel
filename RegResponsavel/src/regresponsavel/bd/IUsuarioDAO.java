package regresponsavel.bd;

import java.util.List;
import regresponsavel.model.UsuarioModel;

public interface IUsuarioDAO {
    
    public abstract void cadastrarUsuario(UsuarioModel u);
    
    public abstract void alterarSenha(UsuarioModel u);
    
    public abstract List obterUsuarios();
}
