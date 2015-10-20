/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
import siop.araguaina.pojo.Envolvido;

/**
 *
 * @author SIOP4
 */
@ManagedBean
@RequestScoped
public class ListagemBean {
    private static List<Envolvido> lista;
   
    public void abrirDialogo() {
        Map<String, Object> opcoes = new HashMap<>();
        opcoes.put("modal", true);
        opcoes.put("resizable", false);
        opcoes.put("contentHeight", 470);

        RequestContext.getCurrentInstance().openDialog("SelecaoEnvolvido", opcoes, null);
    }

    public void selecionar(Envolvido envolvido) {
        RequestContext.getCurrentInstance().closeDialog(envolvido);
    }

    public List<Envolvido> getLista() {
        List<Envolvido> listar = null;
        return listar;
    }

    public void setList(List<Envolvido> lista) {
        ListagemBean.lista = lista;

    }

    
}
