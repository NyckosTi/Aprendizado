/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siop.araguaina.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import tetes.Car;

@ManagedBean
@ApplicationScoped
public class ServicoOcorrencia {
    
    private final static String[] status;
        
        private final static String[] brands;
    
    static {
                status = new String[5];
                status[0] = "Concluida";
                status[1] = "Em andamento";
                status[2] = "Fechada";
                status[3] = "Cancelada";
                status[4] = "Encaminhada";
                
                
                brands = new String[10];
                brands[0] = "BMW";
                brands[1] = "Mercedes";
                brands[2] = "Volvo";
                brands[3] = "Audi";
                brands[4] = "Renault";
                brands[5] = "Fiat";
                brands[6] = "Volkswagen";
                brands[7] = "Honda";
                brands[8] = "Jaguar";
                brands[9] = "Ford";
        }
    
    public List<Car> createCars(int size) {
        List<Car> list = new ArrayList<>();
                for(int i = 0 ; i < size ; i++) {
                        list.add(new Car(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
        }
        
        return list;
    }
    
    private String getRandomId() {
                return UUID.randomUUID().toString().substring(0, 8);
        }
    
    private int getRandomYear() {
                return (int) (Math.random() * 50 + 1960);
        }
        
        private String getRandomColor() {
                return status[(int) (Math.random() * 10)];
        }
        
        private String getRandomBrand() {
                return brands[(int) (Math.random() * 10)];
        }
    
    private int getRandomPrice() {
                return (int) (Math.random() * 100000);
        }
    
    private boolean getRandomSoldState() {
                return (Math.random() > 0.5) ? true: false;
        }
    
    public List<String> getColors() {
        return Arrays.asList(status);
    }
    
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}