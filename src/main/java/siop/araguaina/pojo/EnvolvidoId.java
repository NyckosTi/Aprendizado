package siop.araguaina.pojo;
// Generated 21/08/2015 15:52:52 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnvolvidoId generated by hbm2java
 */
@Embeddable
public class EnvolvidoId  implements java.io.Serializable {


     private int id;
     private int contatoId;
     private int qualificacaoId;

    public EnvolvidoId() {
    }

    public EnvolvidoId(int id, int contatoId, int qualificacaoId) {
       this.id = id;
       this.contatoId = contatoId;
       this.qualificacaoId = qualificacaoId;
    }
   


    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    @Column(name="contato_id", nullable=false)
    public int getContatoId() {
        return this.contatoId;
    }
    
    public void setContatoId(int contatoId) {
        this.contatoId = contatoId;
    }


    @Column(name="qualificacao_id", nullable=false)
    public int getQualificacaoId() {
        return this.qualificacaoId;
    }
    
    public void setQualificacaoId(int qualificacaoId) {
        this.qualificacaoId = qualificacaoId;
    }


     @Override
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EnvolvidoId) ) return false;
		 EnvolvidoId castOther = ( EnvolvidoId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getContatoId()==castOther.getContatoId())
 && (this.getQualificacaoId()==castOther.getQualificacaoId());
   }
   
     @Override
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getContatoId();
         result = 37 * result + this.getQualificacaoId();
         return result;
   }   


}

