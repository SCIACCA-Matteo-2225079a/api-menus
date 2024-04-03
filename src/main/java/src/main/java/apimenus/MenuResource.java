package src.main.java.apimenus;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


/**
 * Ressource associée aux livres
 * (point d'accès de l'API REST)
 */
@Path("/menus")
public class MenuResource {

    /**
     * Service utilisé pour accéder aux données des menus et récupérer/modifier leurs informations
     */
    private MenuService service;

    /**
     * Constructeur par défaut
     */
    public MenuResource(){}

    /**
     * Constructeur permettant d'initialiser le service avec une interface d'accès aux données
     * @param menuRepo objet implémentant l'interface d'accès aux données
     */
    public MenuResource( MenuRepositoryInterface menuRepo ){
        this.service = new MenuService( menuRepo) ;
    }

    /**
     * Constructeur permettant d'initialiser le service d'accès aux menus
     */
    public MenuResource( MenuService service ){
        this.service = service;
    }

    /**
     * Enpoint permettant de publier de tous les menus enregistrés
     * @return la liste des menus (avec leurs informations) au format JSON
     */
    @GET
    @Produces("application/json")
    public String getAllMenus() {
        return service.getAllMenusJSON();
    }
}
