package com.aractron.java.visibility.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author root
 */
// Déclaration
public class Client implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // attributs de classe
    private Integer idt;
    private String nomC;
    private String prenomC;
    private int age;
    private int overDueDay;
    private boolean isPresent;
    private float customerAmountDue;
    private List<Film> listeFilm = new ArrayList<Film>();
    private final int MAX_NUMBER_OF_ITEMS = 100;

    // constructeur avec arguments
    public Client(Integer idt, String nomC, String prenomC, int age) {
        super();
        this.idt = idt;
        this.nomC = nomC;
        this.prenomC = prenomC;
        this.age = age;
    }

    // constructeur sans arguments
    public Client() {

        super();
    }



    // mutator & assecor
    public Integer getIdt() {
        return idt;
    }

    public void setIdt(Integer idt) {
        this.idt = idt;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getPrenomC() {
        return prenomC;
    }

    public void setPrenomC(String prenomC) {
        this.prenomC = prenomC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Film> getListeFilm() {
        return listeFilm;
    }

    public void setListeFilm(List<Film> listeFilm) {
        this.listeFilm = listeFilm;

    }
    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    /**
     * @return the mAX_NUMBER_OF_ITEMS
     */
    public int getMAX_NUMBER_OF_ITEMS() {
        return MAX_NUMBER_OF_ITEMS;
    }

    public float getCustomerAmountDue() {
        return customerAmountDue;
    }

    public void setCustomerAmountDue(float customerAmountDue) {
        this.customerAmountDue = customerAmountDue;
    }

    public int getOverDueDay() {
        return overDueDay;
    }

    public void setOverDueDay(int overDueDay) {
        this.overDueDay = overDueDay;
    }

    /**
     * @param cust
     * @return
     * @see Définition de la méthode getAmountDue pour un client avec une
     * majoration de 1.50 euro pour chaque jour de retard
     */
    float getAmountDue(String cust) {
        // les variables de procédé
        int NUMBEROFDAYS;
        float due;
        float lateCharge = 1.50f;
        String customerName;
        // corps de la méthode
        NUMBEROFDAYS = this.getOverDueDay();
        due = NUMBEROFDAYS * lateCharge;
        customerName = getNomC();
        return due;
    }

    /**
     * @param cust
     * @return
     * @see Définition de la méthode getAmountDueFrequency pour un client qui
     * permet de calculer le nombre de fois qu'un client a un retard dans
     * la livraison d'un film
     */
    int getAmountDueFrequency(String cust) {
        // les variables de procédé
        int NUMBEROFDAYS;
        float due;
        int frequency = 0;
        float lateCharge = 1.50f;
        String customerName;
        // corps de la méthode
        NUMBEROFDAYS = this.getOverDueDay();
        due = NUMBEROFDAYS * lateCharge;
        frequency++;
        customerName = getNomC();
        return frequency;
    }

    public void showClient(Client c) {

        System.out.println("------------");
        System.out.print("identifiant");
        System.out.println(c.getIdt());
        System.out.print("Nom");
        System.out.println(c.getNomC());
        System.out.print("Prenom");
        System.out.println(c.getPrenomC());
        System.out.print("Age");
        System.out.println(c.getAge());
        System.out.println("Nom");
        List<Film> listFilm = new ArrayList<Film>();

        Iterator<Film> it = listFilm.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNomFilm());
            it.next();
        }

    }

}
