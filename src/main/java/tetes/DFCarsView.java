/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetes;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class DFCarsView implements Serializable {

    @ManagedProperty("#{carService}")
    private CarService service;

    private List<Car> cars;

    @PostConstruct
    public void init() {
        cars = service.createCars(9);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setService(CarService service) {
        this.service = service;
    }

    public void selectCarFromDialog(Car car) {
        RequestContext.getCurrentInstance().closeDialog(car);
    }
}
