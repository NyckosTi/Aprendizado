//
//package dao;
//
//import java.util.List;
//import siop.araguaina.modelo.Envolvido;
//import org.hibernate.Query;
//import org.hibernate.Session;
//
///**
// *
// * @author javaes
// */
//public class EnvolvidoDAOHibernate implements EnvolvidoDAO {
//    private Session session;
//    
//    public EnvolvidoDAOHibernate(){}
//
//    public Session getSession() 
//    {
//        return session;
//    }
//
//    public void setSession(Session session) 
//    {
//        this.session = session;
//    }
//
//    @Override
//    public void salvar(Envolvido envolvido) 
//    {
//       this.session.save(envolvido);
//    }
//
//    @Override
//    public void atualizar(Envolvido envolvido) 
//    {
//       this.session.update(envolvido);
//    }
//
//    @Override
//    public void excluir(Envolvido envolvido) 
//    {
//        this.session.delete(envolvido);
//    }
//
//    @Override
//    public Envolvido carregar(long idEnvolvido) 
//    {
//        return (Envolvido) this.session.get(Envolvido.class,idEnvolvido);
//    }
//
//    @Override
//    public Envolvido buscarPorMatricula(String matricula) 
//    {
//       String hql               ="select a from Envolvido a where a.matricula = :matricula";
//       Query consulta           = this.session.createQuery(hql);
//       consulta.setString("matricula", matricula);
//       return (Envolvido) consulta.uniqueResult();
//    }
//
//    @Override
//    public List<Envolvido> listar() 
//    {
//       return this.session.createCriteria(Envolvido.class).list();
//    }
//    
//}
