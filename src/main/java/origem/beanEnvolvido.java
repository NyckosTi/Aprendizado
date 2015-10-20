/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package origem;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import siop.araguaina.pojo.Envolvido;

/**
 *
 * @author Desenvolvimento
 */
@ViewScoped
@Named
public class beanEnvolvido implements Serializable {

    private static final long serialVersionUID = 1L;

    private Envolvido envolvido = new Envolvido();

    private boolean skip;

    private void limpar() {
        envolvido = new Envolvido();

    }

    public void CadastrarEnvolvido() {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Tudo Ok " + envolvido + "Cadastrado com sucesso"));
        limpar();
    }

    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Envolvido getEnvolvido() {
        return envolvido;
    }

    public void setEnvolvido(Envolvido envolvido) {
        this.envolvido = envolvido;
    }

    public void save() {
        FacesMessage msg = new FacesMessage("Sucesso" + envolvido.getNome()+ "cadastrado com sucesso");
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
//            skip = false;   //reset in case envolvido goes back
//            return "confirm";
//        } else {
//            return event.getNewStep();
//        }
//    }

}
