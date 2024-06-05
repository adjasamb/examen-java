package entities;

public class Cours {
    private int id;
    private String date;
    private String heureDB;
    private String heurefin;
    public Cours() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeureDB() {
        return heureDB;
    }
    public void setHeureDB(String heureDB) {
        this.heureDB = heureDB;
    }
    public String getHeurefin() {
        return heurefin;
    }
    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }
    
}