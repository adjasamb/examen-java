package entities;

import java.util.List;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    public Professeur() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setProfesseur(Professeur professeur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setProfesseur'");
    }
    public List<Professeur> getProfesseur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfesseur'");
    }
    public void insert(Professeur pc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}
