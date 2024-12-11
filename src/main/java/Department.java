package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un département dans une entreprise.
 */
public class Department {

    private String name;
    private List<Employee> employees;

    /**
     * Initialise un nouveau département.
     * 
     * @param name Le nom du département.
     */
    public Department(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du département ne peut pas être vide.");
        }
        this.name = name;
        this.employees = new ArrayList<>(); // Pré-rempli pour introduire les List
    }

    /**
     * Ajoute un employé au département.
     * 
     * @param employee L'employé à ajouter.
     */
    public void addEmployee(Employee employee) {
        if(employee == null) {
            throw new NullPointerException("Employe null");
        }
        employees.add(employee);
    }

    /**
     * Retire un employé du département.
     * 
     * @param employee L'employé à retirer.
     */
    public void removeEmployee(Employee employee) {
        if(employee == null) {
            throw new NullPointerException("Employe null");
        }
        this.employees.remove(employee);
    }

    /**
     * Retourne la liste des employés du département.
     * 
     * @return Une liste des employés.
     */
    public List<Employee> listEmployees() {
        // Retourne une copie de la liste pour éviter des modifications extérieures.
        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        return "Department [name=" + name + ", employees=" + employees + ", listEmployees()=" + listEmployees() + "]";
    }

}