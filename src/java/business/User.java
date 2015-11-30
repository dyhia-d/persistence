package business;

import java.sql.Blob;
import java.sql.Date;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")

public class User {
    @Id
    @Column(name="NUMERO")
    private Long id=null;
    @Column(name="USERNAME")
    private String username;
    @Column(name="PWD")
    private String pwd;
    @Column(name="EMAIL")
    private String email;
    @Column(name="DATERECEPTIONBON")
    private Date dateReceptionBon;
    @Column(name="NIVEAU")
    private String niveau;

    public User() {
    }
    
     public User(String username) {
        this.username = username;
    }
     public User(Long id, String username, String adress, String niveau) {
        this.id = id;
        this.username = username;
        this.email = adress ;
        this.niveau = niveau;
    }

    public User(String username, String pwd, String email, Date dateReceptionBon, String niveau) {
        this.username = username;
        this.pwd = pwd;
        this.email = email;
        this.dateReceptionBon = dateReceptionBon;
        this.niveau = niveau;
    }
     
    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateReceptionBon() {
        return dateReceptionBon;
    }

    public void setDateReceptionBon(Date ReceptionBon) {
        this.dateReceptionBon = ReceptionBon;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
    
    public boolean isReceiveThisMonth(){
        if(this.dateReceptionBon == null){
            return false;
        }else{
            //Initialisation du calendrier qui contient la date "dateReceptionBon"
        Calendar calReceive = Calendar.getInstance();
        calReceive.setTime(dateReceptionBon);
        //Initialisation du calendrier qui contient la date actuelle.
        Calendar calCurrentDate = Calendar.getInstance();
        //Si les mois sont identiques, on retourne true.
        return calCurrentDate.get(Calendar.MONTH) == calReceive.get(Calendar.MONTH);
        }    
    }    
}
