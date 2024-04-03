package src.main.java.apimenus;

/**
 * Classe représentant un menu
 */
public class Menu {

    /**
     * nom du menu
     */
    protected String name;

    /**
     * Statut du menu
     * ('c' pour commandé, 'l' pour livré)
     */
    protected char status;

    /**
     * Constructeur par défaut
     */
    public Menu(){
    }

    /**
     * Constructeur de menu
     * @param name titre du menu
     */
    public Menu(String name, char status){
        this.name = name;
        this.status = 'c';
    }

    /**
     * Méthode permettant d'accéder au nom du menu
     * @return un chaîne de caractères avec le nom du menu
     */
    public String getName() {
        return name;
    }

    /**
     * Méthode permettant d'accéder au statut du menu
     * @return un caractère indiquant le statut du menu ('c' pour commandé, 'l' pour livré)
     */
    public char getStatus() {
        return status;
    }

    /**
     * Méthode permettant de modifier le nom du menu
     * @param name une chaîne de caractères avec le nom à utiliser
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Méthode permettant de modifier le statut du menu
     * @param status le caractère 'c' pour commandé, 'l' pour livré
     */
    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Nom = '" + name + '\'' +
                ", statut = " + status +
                '}';
    }
}