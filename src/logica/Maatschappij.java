package logica;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoachimVAST
 */
public class Maatschappij {

    private String naam;
    private ArrayList<Vlucht> vluchten = new ArrayList();

    public Maatschappij(String naam) {
        // Exceptie opwerpen als er geen naam wordt ingegeven bij de constructor
        if (naam == null) {
            throw new IllegalArgumentException("Geef een geldige naam in.");
        }
        this.naam = naam;
    }

    // Getters voor de private velden
    public String getNaam() {
        return naam;
    }

    public ArrayList<Vlucht> getVluchten() {
        return vluchten;
    }

    // 2de getter voor vluchten gebaseerd op Luchthaven van en naar
    public ArrayList<Vlucht> getVluchten(Luchthaven van, Luchthaven naar) {

        // Initialisatie van nieuwe ArrayList waar we de selectie in voeren
        ArrayList<Vlucht> selectievluchten = new ArrayList();

        /* Initialisatie van integer size dat de size van de ArrayList vluchten bevat
       * Dit zorgt voor optimalisatie van het programma, anders gaat het programma bij elke iteratie in de onderstaande for-loop
       * telkens opnieuw de size() berekenen, dit is niet handing voor een programma met misschien duizenden tot miljoenen records
         */
        int size = vluchten.size();

        // for-loop om over elk element van de ArrayList te itereren
        for (int i = 0; i < size; i++) {
            Vlucht selectie = vluchten.get(i);
            if (selectie.getVan() == van && selectie.getNaar() == naar) {
                selectievluchten.add(selectie);
            }
        }
        return selectievluchten;
    }

    // Aangepaste toString - methode, betere formatting voor printen
    @Override
    public String toString() {

        /* Initialisatie van integer size dat de size van de ArrayList vluchten bevat
       * Dit zorgt voor optimalisatie van het programma, anders gaat het programma bij elke iteratie in de onderstaande for-loop
       * telkens opnieuw de size() berekenen, dit is niet handing voor een programma met misschien duizenden tot miljoenen records
         */
        int size = vluchten.size();

        String s = "Maatschappij: " + naam + "\n";

        // For - loop om text overzichtelijk af te printen
        for (int i = 0; i < size; i++) {
            s += "\t Vlucht :" + vluchten.get(i) + "\n";
        }
        return s;
    }
}
