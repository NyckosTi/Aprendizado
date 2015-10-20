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
public class EstadoNatal implements Serializable {

      private final Map<String, Map<String, String>> dt = new HashMap<>();
      private String country;
      private String city;
      private Map<String, String> countries;
      private Map<String, String> cities;

      @PostConstruct
      public void init() {
            countries = new HashMap<>();
            countries.put("Tocantins", "TO");
            countries.put("Pará", "PA");
            countries.put("Maranhão", "MA");

            Map<String, String> map = new HashMap<>();
            map.put("Araguaina", "Araguaina");
            map.put("Wanderlândia", "Wanderlândia");
            map.put("Nova Olinda", "Nova Olinda");
            dt.put("TO", map);

            map = new HashMap<>();
            map.put("São Geraldo", "São Geraldo");
            map.put("Marabá", "Marabá");
            map.put("Xinguara", "Xinguara");
            dt.put("PA", map);

            map = new HashMap<>();
            map.put("Imperatriz", "Imperatriz");
            map.put("Estreito", "Estreito");
            map.put("Balsas", "Balsas");
            dt.put("MA", map);
      }

      public Map<String, Map<String, String>> getDt() {
            return dt;
      }

      public String getCountry() {
            return country;
      }

      public void setCountry(String country) {
            this.country = country;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public Map<String, String> getCountries() {
            return Collections.unmodifiableMap(countries);
      }

      public Map<String, String> getCities() {
            return cities;
      }

      public void onCountryChange() {
            if (country != null && !country.equals("")) {
                  cities = dt.get(country);
            } else {
                  cities = new HashMap<String, String>();
            }
      }

      public void displayLocation() {
            FacesMessage msg;
            if (city != null && country != null) {
                  msg = new FacesMessage("Selected", city + " of " + country);
            } else {
                  msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected.");
            }

            FacesContext.getCurrentInstance().addMessage(null, msg);
      }
}
