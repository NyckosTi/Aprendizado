//package cadastro;
//
//import java.util.List;
//import dao.EnvolvidoDAO;
//import siop.araguaina.modelo.Envolvido;
//import util.DAOFactory;
//
///**
// *
// * @author javaes
// */
//public class EnvolvidoRN
//{
//    
//   private EnvolvidoDAO envolvidoDAO;
//    
//    public EnvolvidoRN()
//    {
//        this.envolvidoDAO  = DAOFactory.criarEnvolvidoDAO();
//    }
//    
//    public Envolvido carregar(long idEnvolvido)
//    {
//        return this.envolvidoDAO.carregar(idEnvolvido);
//    }
//    
//    public Envolvido buscarPorMatricula(String matricula)
//    {
//        return this.envolvidoDAO.buscarPorMatricula(matricula);
//    }
//    
//    public void salvar(Envolvido envolvido)
//    {
//        long id = envolvido.getId();
//        
//        if(id == 0)
//        {
//           this.envolvidoDAO.salvar(envolvido); 
//        }
//        else
//        {
//            this.envolvidoDAO.atualizar(envolvido);
//        }
//    }
//    
//    public void excluir(Envolvido envolvido)
//    {
//        this.envolvidoDAO.excluir(envolvido);
//    }
//    
//    public List<Envolvido> listar()
//    {
//        return this.envolvidoDAO.listar();
//    }
//    
//}
