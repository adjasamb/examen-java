import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Client;

import entities.Cours;
import services.CoursService;
import services.ModuleService;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1-Ajouter un module ");
            System.out.println("2-Lister les modules");
            System.out.println("3-Creer un cours");
            System.out.println("4-Lister tous les cours");
            System.out.println("5-Lister les cours d'un module et d'un professeur");
            System.out.println("6-Quitter");
         
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Entrer un id");
                    String iString = sc.nextLine();
                    System.out.println("Entrer un module");
                    String modString = sc.nextLine();
                    Module md = new Module();
                    ModuleService.ajoutermodule(md);
                    break;
                case 2:
                    List<Module> Modules = Modules.listermodule();
                    for (Module module : Module) {
                        System.out.println("ID" + module.getId());
                        System.out.println("Module " + module.getmodule());
                    }
                    break;

                case 3:
                    System.out.println("Entrer un Cours");
                    String cString = sc.nextLine();
                    System.out.println("Entrer la date du cours");
                    String dString = sc.nextLine();
                    System.out.println("Entrer l'heure de debut du cours'");
                    String heureDB = sc.nextLine();
                    System.out.println("Entrer l'heure de fin du cours");
                    String heurefin = sc.nextLine();
                    Cours cours = new cours();
                    Date.setDate(dString);
                    heureDB.setHeureDB(heureDB);
                    heurefin.setHeurefin(heurefin);
                    CoursService.ajouterCours(cours);
                    break;
            
                default:
                    break;
                case 4:

                    break;
                case 5:

                     break;
            }
        }while(choix!=6);
    }

    
}
