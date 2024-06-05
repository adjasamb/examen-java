package services;

import java.util.List;

import entities.Professeur;
import repository.ProfesseurRepository;

public class ProfesseurService {
    ProfesseurRepository professseurrepository=new ProfesseurRepository();

    public void ajouterUnprofesseur(Professeur professeur){
        ProfesseurRepository.insert(professeur);
        List<Professeur> professeurdeclasses=professeur.getProfesseur();
        for (Professeur pc : Professeur){
            pc.setProfesseur(professeur);
            professeur.insert(pc);
        }
    }
 }