package business;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMENTAIRE")

public class Commentaire {
    @Id
    @Column(name="NUMERO")
    private Long id=null;
    @Column(name="USERS_NUMERO")
    private Long users_numero=null;
    @Column(name="COMMENTAIRE")
    private String commentaire;
    @Column(name="DATEAJOUT")
    private Date dateAjout=null;
    
    public Commentaire(String commentaire,Long comm_users) {
        this.commentaire = commentaire;
    }
    
    public Commentaire(){
        
    }

    public Long getUsers_numero() {
        return users_numero;
    }

    public void setUsers_numero(Long comm_users) {
        this.users_numero = comm_users;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Long getId() {
        return id;
    }
   
    public void setId(Long id){
        this.id = id;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }
}
