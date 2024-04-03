package src.main.java.apimenus;

import java.util.*;

/**
 * Interface d'accès aux données des menus
 */
public interface MenuRepositoryInterface {

    /**
     *  Méthode fermant le dépôt où sont stockées les informations sur les menus
     */
    public void close();

    /**
     * Méthode retournant la liste des menus
     * @return une liste d'objets menus
     */
    public ArrayList<Menu> getAllMenus() ;

    /**
     * Méthode permettant de mettre à jours un menu enregistré
     * @param name nouveau nom du menu
     * @param status nouveau status du menu
     * @return true si le menu existe et la mise à jours a été faite, false sinon
     */
    public boolean updateMenu(String name, char status);
}
