package src.main.java.apimenus;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import java.util.ArrayList;


/**
 * Classe utilisée pour récupérer les informations nécessaires à la ressource
 * (permet de dissocier ressource et mode d'éccès aux données)
 */
public class MenuService {

    /**
     * Objet permettant d'accéder au dépôt où sont stockées les informations sur les menus
     */
    protected MenuRepositoryInterface menuRepo ;

    /**
     * Constructeur permettant d'injecter l'accès aux données
     * @param menuRepo objet implémentant l'interface d'accès aux données
     */
    public  MenuService( MenuRepositoryInterface menuRepo) {
        this.menuRepo = menuRepo;
    }

    /**
     * Méthode retournant les informations sur les menus au format JSON
     * @return une chaîne de caractère contenant les informations au format JSON
     */
    public String getAllMenusJSON(){

        ArrayList<Menu> allMenus = menuRepo.getAllMenus();

        // création du json et conversion de la liste de menus
        String result = null;
        try( Jsonb jsonb = JsonbBuilder.create()){
            result = jsonb.toJson(allMenus);
        }
        catch (Exception e){
            System.err.println( e.getMessage() );
        }

        return result;
    }

    /**
     * Méthode permettant de mettre à jours les informations d'un menu
     * @param menu les nouvelles informations ont été utilisées
     * @return true si le menu a pu être mis à jour
     */
    public boolean updateMenu(Menu menu) {
        return menuRepo.updateMenu(menu.name, menu.status);
    }
}
