package origem;
/** @author Desenvolvimento */
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
@Entity
@Table //(name = "envolvido") #>o nome já é automático não precisa definir

public class Envolvidobase implements Serializable {

      //Conforme tabela dados do banco
    //Dados Peasoais
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, length = 80)
    private String nome;

    private String apelido;

    private String sexo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascimento;

    private String rg;

    private String orgao;

    private String cor;

    private String cpf;

    private String pai;

    private String mae;

    private String estadocivil;

    private String profissao;

    private String localTrabalh;

    //Naturalidade e nacionalidade
    private String cidadeNatal;

    private String ufNatal;

    private String paisNatal;

    //Endereço
    private String logradouro;

    private Integer numero;

    private String cidade;

    private String referencia;//= ao campo complemento no banco

    private String uf;

    private String pais;

    private String cep;

    //Contato
    private String celular;

    private String celular1;

    private String fixo;

    private String inforadiciona;
    
    //@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    public Envolvidobase(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        }

    public Envolvidobase() {
         }

    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

    public void click() {
        RequestContext requestContext = RequestContext.getCurrentInstance();

        requestContext.update("form:display");
        requestContext.execute("PF('dlg').show()");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

       public List<String> completeArea(String query) {
        List<String> results = new ArrayList<>();
         
        if(query.equals("PrimeFaces")) {
            results.add("PrimeFaces Rocks!!!");
            results.add("PrimeFaces has 100+ components.");
            results.add("PrimeFaces is lightweight.");
            results.add("PrimeFaces is easy to use.");
            results.add("PrimeFaces is developed with passion!");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
    public String getInforadiciona() {
        return inforadiciona;
    }

    public void setInforadiciona(String inforadiciona) {
        this.inforadiciona = inforadiciona;
    }

    public String getSexo() {
        return sexo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalTrabalh() {
        return localTrabalh;
    }

    public void setLocalTrabalh(String localTrabalh) {
        this.localTrabalh = localTrabalh;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getUfNatal() {
        return ufNatal;
    }

    public void setUfNatal(String ufNatal) {
        this.ufNatal = ufNatal;
    }

    public String getPaisNatal() {
        return paisNatal;
    }

    public void setPaisNatal(String paisNatal) {
        this.paisNatal = paisNatal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    @Override
    public String toString() {
        return "Envolvido{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", sexo=" + sexo + ", dtNascimento=" + dtNascimento + ", rg=" + rg + ", orgao=" + orgao + ", cor=" + cor + ", cpf=" + cpf + ", pai=" + pai + ", mae=" + mae + ", estadocivil=" + estadocivil + ", profissao=" + profissao + ", localTrabalh=" + localTrabalh + ", cidadeNatal=" + cidadeNatal + ", ufNatal=" + ufNatal + ", paisNatal=" + paisNatal + ", logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + ", referencia=" + referencia + ", uf=" + uf + ", pais=" + pais + ", cep=" + cep + ", celular=" + celular + ", celular1=" + celular1 + ", fixo=" + fixo + ", inforadiciona=" + inforadiciona + ", email=" + email + '}';
    }
    
}
