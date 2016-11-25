package logica;


import java.util.*;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoachimVAST
 */
public class Cataloog {

    int size;
    private Maatschappij[] cataloog;

    public Cataloog(int size) {
        this.size = size;
    }

    public void voegToe(String naam) {
        for (int i = 0; i < size; i++) {
            if (cataloog[i] == null) {
                Maatschappij insert =  new Maatschappij(naam);
                cataloog[i] = insert;
            }
            else throw new IllegalArgumentException("Gelieve de size opnieuw te bepalen");
        }
    }

    @Override
    public String toString() {
        String s = "Cataloog:";

        for (int i = 0; i < cataloog.length; i++) {
            s += "\t" + cataloog[i] + "\n";
        }
        return s;
    }

    public String maatschappijToString(Maatschappij maatschappij) {
        return maatschappij.toString();
    }

    public List<Luchthaven> getLuchthaven(Maatschappij maatschappij) {
        // Eerst gaan we alle vluchten van die maatschappij in een nieuwe ArrayList kopiëren
        ArrayList<Vlucht> selectievluchten;
        selectievluchten = maatschappij.getVluchten();

        // List van alle Luchthavens
        List<Luchthaven> selectieluchthavens = new ArrayList();

        // Itereren over de selectievluchten en via getters de van en naar Luchthaven opslaan in nieuwe ArrayList
        
        int selectiesize = selectievluchten.size();
        for (int i = 0; i < selectiesize; i++) {
            selectieluchthavens.add(selectievluchten.get(i).getVan());
            selectieluchthavens.add(selectievluchten.get(i).getNaar());
        }
        
        // Via Java8 kunnen we heel gemakkelijk duplicates filteren uit een List<>
        selectieluchthavens = selectieluchthavens.stream().distinct().collect(Collectors.toList());
        
        return selectieluchthavens;
    }
    
    public ArrayList<Vlucht> getVluchten(Luchthaven van, Luchthaven naar){
        ArrayList<Vlucht> selectie = new ArrayList();

        return selectie;
    }
    
    public ArrayList<Vlucht> getVluchten(Maatschappij maatschappij, Luchthaven van, Luchthaven naar){
        for(int i = 0; i < size; i++){
        }
    }
    

    public String recordsToString(){
        String s = "";
        for(int i = 0; i < size; i++){
            cataloog[i] = new Maatschappij(cataloog[i].getNaam());
            s = cataloog[i].toString();
            ArrayList<Vlucht> selectie = cataloog[i].getVluchten();
            s += selectie.toString();
        }
        return s;
    }

}
