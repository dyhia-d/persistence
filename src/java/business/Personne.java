package business;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONNE")

public class Personne implements Serializable {
    @Id
    @Column(name="NUMERO")
    private Long id=null;
    @Column(name="NOM")
    private String nom=null;
    @Column(name="PRENOM")
    private String prenom=null;
    @Column(name="ADRESSE")
    private String adresse=null;
    @Column(name="VILLE")
    private String ville=null;

    public Personne() {
    }

    public Personne(Long id, String nom, String prenom, String adresse, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }
    public Personne( String nom, String prenom, String adresse, String ville) {

        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    public void print(){
      System.out.println(this.id+ "-"+this.nom+"-"+this.prenom+"-"+this.adresse+"-"+this.ville);
    }

     public String toString(){
      return this.id+ "-"+this.nom+"-"+this.prenom+"-"+this.adresse+"-"+this.ville;
    }
}
