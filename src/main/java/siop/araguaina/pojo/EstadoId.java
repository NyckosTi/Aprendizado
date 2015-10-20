package siop.araguaina.pojo;
// Generated 21/08/2015 15:52:52 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EstadoId generated by hbm2java
 */
@Embeddable
public class EstadoId  implements java.io.Serializable {


     private int id;
     private int paisId;

    public EstadoId() {
    }

    public EstadoId(int id, int paisId) {
       this.id = id;
       this.paisId = paisId;
    }
   


    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    @Column(name="pais_id", nullable=false)
    public int getPaisId() {
        return this.paisId;
    }
    
    public void setPaisId(int paisId) {
        this.paisId = paisId;
    }


     @Override
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EstadoId) ) return false;
		 EstadoId castOther = ( EstadoId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getPaisId()==castOther.getPaisId());
   }
   
     @Override
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getPaisId();
         return result;
   }   


}

