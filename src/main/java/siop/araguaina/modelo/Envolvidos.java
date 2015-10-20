package siop.araguaina.modelo;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import siop.araguaina.pojo.Envolvido;

public class Envolvidos implements Serializable {

    private static final long serialVersionUID = 1L;

    
    
    @Inject
    private EntityManager manager;

    public Envolvido porId(Long id) {
        return manager.find(Envolvido.class, id);
    }

    public List<Envolvido> porNomeSemelhante(String nome) {
        return null;
       
//		return manager.createQuery("from Envolvido where nome like :nome", Envolvido.class).setParameter("nome", "%" + nome + "%").getResultList();
    }

  
}
