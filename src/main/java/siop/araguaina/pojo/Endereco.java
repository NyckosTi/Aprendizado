package siop.araguaina.pojo;
// Generated 21/08/2015 15:52:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name="endereco"
    ,catalog="ocorrencia"
)
public class Endereco  implements java.io.Serializable {


     private EnderecoId id;
     private Cidade cidade;
     private String logradouro;
     private Integer numero;
     private String bairro;
     private Integer cep;
     private String complemento;
     private Set envolvidos = new HashSet(0);

    public Endereco() {
    }

	
    public Endereco(EnderecoId id, Cidade cidade, String logradouro) {
        this.id = id;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }
    public Endereco(EnderecoId id, Cidade cidade, String logradouro, Integer numero, String bairro, Integer cep, String complemento, Set envolvidos) {
       this.id = id;
       this.cidade = cidade;
       this.logradouro = logradouro;
       this.numero = numero;
       this.bairro = bairro;
       this.cep = cep;
       this.complemento = complemento;
       this.envolvidos = envolvidos;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ), 
        @AttributeOverride(name="cidadeId", column=@Column(name="cidade_id", nullable=false) ), 
        @AttributeOverride(name="cidadeEstadoId", column=@Column(name="cidade_estado_id", nullable=false) ), 
        @AttributeOverride(name="cidadeEstadoPaisId", column=@Column(name="cidade_estado_pais_id", nullable=false) ) } )
    public EnderecoId getId() {
        return this.id;
    }
    
    public void setId(EnderecoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="cidade_id", referencedColumnName="id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="cidade_estado_id", referencedColumnName="estado_id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="cidade_estado_pais_id", referencedColumnName="estado_pais_id", nullable=false, insertable=false, updatable=false) } )
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    
    @Column(name="logradouro", nullable=false, length=45)
    public String getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    
    @Column(name="numero")
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
    @Column(name="bairro", length=45)
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name="cep")
    public Integer getCep() {
        return this.cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }

    
    @Column(name="complemento", length=45)
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="endereco")
    public Set getEnvolvidos() {
        return this.envolvidos;
    }
    
    public void setEnvolvidos(Set envolvidos) {
        this.envolvidos = envolvidos;
    }




}

