/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetes;

import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
 
@ManagedBean
public class dfView {
     
    public void viewCars() {
        RequestContext.getCurrentInstance().openDialog("viewCars");
    }
     
    public void viewCarsCustomized() {
        Map<String,Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentHeight", 320);
         
        RequestContext.getCurrentInstance().openDialog("viewCars", options, null);
    }
    public void chooseCar() {
        RequestContext.getCurrentInstance().openDialog("selectCar");
    }
     
    public void onCarChosen(SelectEvent event) {
        Car car = (Car) event.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + car.getId());
         
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
