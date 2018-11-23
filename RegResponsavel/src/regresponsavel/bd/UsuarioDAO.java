package regresponsavel.bd;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import regresponsavel.model.UsuarioModel;

public class UsuarioDAO implements IUsuarioDAO {
    
    private EntityManager em = null;

    @Override
    public void cadastrarUsuario(UsuarioModel u) {
        try {
            em = ConnectionFactoryHibernate.obterConexao(); 
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e)  {
            em.getTransaction().rollback();
            throw new RuntimeException("Exceção de Banco de Dados: " + e);
        } finally {
            em.close();
        }
    }

    @Override
    public void alterarSenha(UsuarioModel u) {
        try {
            em = ConnectionFactoryHibernate.obterConexao();             
            em.getTransaction().begin();
            em.merge(u); // atualizar os dados do objeto da memória na base de dados.
            em.getTransaction().commit();
        } catch (Exception e)  {
            em.getTransaction().rollback();
            throw new RuntimeException("Exceção de Banco de Dados: " + e);
        } finally {
            em.close();
        }
    } 

    @Override
    public boolean autenticarUsuario(String prontuario, String senha) {
        try {
            em = ConnectionFactoryHibernate.obterConexao();
            Query hql = em.createQuery("select object(u) from UsuarioModel as u where u.prontuario = :prontuario and u.senha = :senha")
                    .setParameter("prontuario", prontuario)
                    .setParameter("senha", senha);            
            Object obj = hql.getSingleResult(); 
            return obj != null;
        } catch (Exception ex)  {
            return false;
        } finally {
            em.close();
        }    
    }
}
