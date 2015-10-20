/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siop.araguaina.repositorio;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author SIOP4
 */
public class EnvolvidoRepo implements Serializable {
    private static final long SerialVersionUID = 1L;
    
    @Inject
    private EntityManager manager;
    public EnvolvidoRepo porId(long id){
        return manager.find(EnvolvidoRepo.class, id);
    }
    public List<EnvolvidoRepo> porNomeSemelhante(String string){
        return manager.createQuery("from Envolvido env where env.nome like :nome", EnvolvidoRepo.class)
                .setParameter("nome", "%" + string + "%")
                .getResultList();
    }
}
