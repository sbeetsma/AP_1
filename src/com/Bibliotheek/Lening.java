package com.Bibliotheek;
import java.util.ArrayList;

public class Lening {

    private ArrayList<Leenbaar> Leningen;
    private Bibliotheek Bibliotheek;
    private Klant Klant;

    public Lening(ArrayList<Leenbaar> leningen, Bibliotheek bibliotheek, Klant klant) {
        this.Leningen = leningen;
        this.Bibliotheek = bibliotheek;
        this.Klant = klant;
    }

    public void Huur(){
        ArrayList<Leenbaar> verwijders = new ArrayList<>();
        for (Leenbaar leenbaar : this.Leningen) {
            if(!leenbaar.getBeschikbaar()){
                verwijders.add(leenbaar);
            }
            leenbaar.Huren();
        }
            this.Leningen.removeAll(verwijders);
        }

    public void Inleveren(){
        for (Leenbaar leenbaar : this.Leningen) {
            leenbaar.Inleveren();
        }
    }

    public ArrayList<Leenbaar> getLeningen() {
        return Leningen;
    }

    public void setLeningen(ArrayList<Leenbaar> leningen) {
        this.Leningen = leningen;
    }

    public Bibliotheek getBibliotheek() {
        return Bibliotheek;
    }

    public void setBibliotheek(Bibliotheek bibliotheek) {
        this.Bibliotheek = bibliotheek;
    }

    public Klant getKlant() {
        return Klant;
    }

    public void setKlant(Klant klant) {
        this.Klant = klant;
    }

    @Override
    public String toString() {
        String Leningenstring = "";
        for (Leenbaar leenbaar : this.Leningen) {
            Leningenstring = Leningenstring + leenbaar.getTitel() + "\n";
        }
        return this.Klant.toString() + "leningen:\n" + Leningenstring + "\n" +this.Bibliotheek.toString();
    }
}