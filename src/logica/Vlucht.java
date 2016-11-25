package logica;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoachimVAST
 */
public class Vlucht  implements Comparable<Vlucht> {
    private Luchthaven van;
    private Luchthaven naar;
    private Date datum;
    private String vluchtNr;
    private double prijs;
    private int aantalVrijePlaatsen;
    
    public Vlucht(Luchthaven van, Luchthaven naar, Date datum, String vluchtNr, double prijs, int aantal){
        this.van = van;
        this.naar = naar;
        this.datum = datum;
        this.vluchtNr = vluchtNr;
        this.prijs = prijs;
        this.aantalVrijePlaatsen = aantal;
    }

    public Luchthaven getVan() {
        return van;
    }

    public Luchthaven getNaar() {
        return naar;
    }

    public Date getDatum() {
        return datum;
    }

    public double getPrijs() {
        return prijs;
    }
    
    public static void boek(int aantal){
        // TODO
    }

    @Override
    public String toString() {
        
        // Object van klasse SimpleDateFormat initialiseren om datum te formatteren 
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY HH:MM");
        
        // format functie om datum te formatteren
        format.format(datum);
        
        // eigen toString
        return "" + van + " - " + naar + " - " + datum + " - " + vluchtNr + " - " + prijs + " - " + aantalVrijePlaatsen + " plaatsen beschikbaar";
    }

    @Override
    public int compareTo(Vlucht v) {
        
        // Eerst sorteren op Luchthaven van
        int check1 =  this.van.compareTo(v.van);
        if(check1 != 0){
            return check1;
        }
        
        // Als eerste sorteermethode niet geldt, sorteren op Luchthaven naar
        int check2 = this.naar.compareTo(v.naar);
        if(check2 != 0){
            return check2;
        }
        
        // Als tweede sorteermethode niet geldt, sorteren op datum
        return this.datum.compareTo(v.datum);
    }
    
    

}
    

            
