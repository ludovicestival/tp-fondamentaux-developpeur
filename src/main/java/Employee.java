package main.java;

/**
* Représente un employé dans une entreprise avec un nom, un identifiant et une positon.
*/
public class Employee {

    private String nom;
    private int id;
    private String position;

    /**
     * Initialise un nouvel employé.
     * @param nom Le nom de l'employé (non vide)
     * @param id L'identifiant de l'employé (positif)
     * @param position La position de l'employé
     * @throws IllegalArgumentException si le nom est vide ou si l'id est négatif
     */
    public Employee(String nom, int id, String position) {
        if(nom == null) {
            throw new IllegalArgumentException("Le nom doit être non null.");
        }

        if(id < 0) {
            throw new IllegalArgumentException("L'id doit être positif.");
        }
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    /**
     * Renvoie le nom de l'employé.
     * @return le nom de l'employé
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renvoie l'identifiant de l'employé.
     * @return l'identifiant de l'employé
     */
    public int getId() {
        return id;
    }

    /**
     * Renvoie la position de l'employé.
     * @return la position de l'employé
     */
    public String getPosition() {
        return position;
    }

    /**
     * Affiche les caractéristiques d'un employé.
     * @return une représentation d'un employé
     */
    public String toString() {
        return "Employee [nom=" + nom + ", id=" + id + ", position=" + position + "]";
    }

    
}