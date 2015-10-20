/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siop.araguaina.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import siop.araguaina.pojo.Envolvido;

/**
 *
 * @author Desenvolvimento
 */
@ManagedBean
@ViewScoped
public class EnvolvidoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Envolvido envolvidobase = new Envolvido();

    private boolean skip;

    private void limpar() {
        envolvidobase = new Envolvido();

    }

    public void CadastrarEnvolvido() {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Tudo Ok " + envolvidobase + "Cadastrado com sucesso"));
        limpar();
    }

    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Envolvido getEnvolvidobase() {
        return envolvidobase;
    }

    public void setEnvolvidobase(Envolvido envolvidobase) {
        this.envolvidobase = envolvidobase;
    }

    public void save() {
        FacesMessage msg = new FacesMessage("Sucesso" + envolvidobase.getNome()+ "cadastrado com sucesso");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public void abrirDialogo() {
        Map<String, Object> opcoes = new HashMap<>();
        opcoes.put("modal", true);
        opcoes.put("resizable", true);
        opcoes.put("contentHeight", 586);

        RequestContext.getCurrentInstance().openDialog("Selecao", opcoes, null);
    }

//    public String onFlowProcess(FlowEvent event) {
//        if (skip) {
//            skip = false;   //reset in case envolvidobase goes back
//            return "confirm";
//        } else {
//            return event.getNewStep();
//        }
//    }

}
