package repository;

import java.util.ArrayList;
import java.util.List;

import entities.Cours;

public class CoursRepository extends Database{

      List<Cours> tCours=new ArrayList<>();
      public void insert(Cours cours){
        tCours.add(cours);
      }

      public List<Cours> selectAll(){
        return tCours;
      }
      public Cours selectcoCours(String cString){
        for (Cours cours : tCours) {
          if (cours.getHeureDB().compareTo(heurefin)==0) {
           return cours; 
          }
        }
        return null;
      }
} 
