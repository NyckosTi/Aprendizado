/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siop.araguaina.uf;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class ListaEstado implements Serializable {

      private final Map<String, Map<String, String>> est = new HashMap<>();
      private String estado;
      private String cidade;
      private Map<String, String> estados;
      private Map<String, String> cidades;

      @PostConstruct
      public void init() {
            estados = new HashMap<>();
            estados.put("Tocantins", "TO");
            estados.put("Pará", "PA");
            estados.put("Maranhão", "MA");

            Map<String, String> map = new HashMap<>();
            map.put("Araguaina", "Araguaina");
            map.put("Wanderlândia", "Wanderlândia");
            map.put("Nova Olinda", "Nova Olinda");
            est.put("TO", map);

            map = new HashMap<>();
            map.put("São Geraldo", "São Geraldo");
            map.put("Marabá", "Marabá");
            map.put("Xinguara", "Xinguara");
            est.put("PA", map);

            map = new HashMap<>();
            map.put("Imperatriz", "Imperatriz");
            map.put("Estreito", "Estreito");
            map.put("Balsas", "Balsas");
            est.put("MA", map);
      }

      public Map<String, Map<String, String>> getEst() {
            return est;
      }

      public String getEstado() {
            return estado;
      }

      public void setEstado(String estado) {
            this.estado = estado;
      }

      public String getCidade() {
            return cidade;
      }

      public void setCidade(String cidade) {
            this.cidade = cidade;
      }

      public Map<String, String> getEstados() {
            return Collections.unmodifiableMap(estados);
      }

      public Map<String, String> getCidades() {
            return cidades;
      }

      public void onEstadoChange() {
            if (estado != null && !estado.equals("")) {
                  cidades = est.get(estado);
            } else {
                  cidades = new HashMap<String, String>();
            }
      }

      public void displayLocation() {
            FacesMessage msg;
            if (cidade != null && estado != null) {
                  msg = new FacesMessage("elecionado", cidade + " of " + estado);
            } else {
                  msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "Cidade não selecionada.");
            }

            FacesContext.getCurrentInstance().addMessage(null, msg);
      }
}

