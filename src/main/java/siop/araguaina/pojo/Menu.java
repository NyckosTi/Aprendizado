package siop.araguaina.pojo;
// Generated 21/08/2015 15:52:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name="menu"
    ,catalog="ocorrencia"
)
public class Menu  implements java.io.Serializable {


     private Integer id;
     private Menu menu;
     private int nivel;
     private int ordem;
     private String nome;
     private String url;
     private String icone;
     private Boolean estado;
     private Set menus = new HashSet(0);
     private Set rolmenus = new HashSet(0);

    public Menu() {
    }

	
    public Menu(int nivel, int ordem) {
        this.nivel = nivel;
        this.ordem = ordem;
    }
    public Menu(Menu menu, int nivel, int ordem, String nome, String url, String icone, Boolean estado, Set menus, Set rolmenus) {
       this.menu = menu;
       this.nivel = nivel;
       this.ordem = ordem;
       this.nome = nome;
       this.url = url;
       this.icone = icone;
       this.estado = estado;
       this.menus = menus;
       this.rolmenus = rolmenus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="menu_id")
    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    
    @Column(name="nivel", nullable=false)
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Column(name="ordem", nullable=false)
    public int getOrdem() {
        return this.ordem;
    }
    
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="url", length=120)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="icone", length=45)
    public String getIcone() {
        return this.icone;
    }
    
    public void setIcone(String icone) {
        this.icone = icone;
    }

    
    @Column(name="estado")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="menu")
    public Set getMenus() {
        return this.menus;
    }
    
    public void setMenus(Set menus) {
        this.menus = menus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="menu")
    public Set getRolmenus() {
        return this.rolmenus;
    }
    
    public void setRolmenus(Set rolmenus) {
        this.rolmenus = rolmenus;
    }




}

