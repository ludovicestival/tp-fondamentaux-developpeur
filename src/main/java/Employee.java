package main.java;

/**
* Représente un employé dans une entreprise.
*/
public class Employee {

    private String nom;
    private int id;
    private String position;

    public Employee(String nom, int id, String position) {
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee [nom=" + nom + ", id=" + id + ", position=" + position + "]";
    }

    
}