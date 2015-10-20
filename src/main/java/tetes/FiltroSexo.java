/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetes;

/**
 *
 * @author SIOP4
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

 
@ManagedBean
@ApplicationScoped
public class FiltroSexo {
     
    private final static String[] sexo;
     
         
    static {
        sexo = new String[2];
        sexo[0] = "Masculino";
        sexo[1] = "Feminino";
           
        
    }
     
    public List<ListagemBean> createCars(int size) {
        List<ListagemBean> list = new ArrayList<>();
        for(int i = 0 ; i < size ; i++) {
         
        }
         
        return list;
    }
     
       
    private String getSexo() {
        return sexo[(int) (Math.random() * 10)];
    }
     
       
    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }
     
   
    public List<String> getColors() {
        return Arrays.asList(sexo);
    }
        
}
