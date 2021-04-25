package com.Bibliotheek;
public class Bibliothecaris extends Persoon {

    private int MedewerkerID;
    private Bibliotheek Bibliotheek;

    public Bibliothecaris(String voornaam, String achternaam, int medewerkerID, Bibliotheek bibliotheek) {
        super(voornaam, achternaam);
        this.MedewerkerID = medewerkerID;
        this.Bibliotheek = bibliotheek;
    }

    public int getMedewerkerID() {
        return this.MedewerkerID;
    }

    public void setMedewerkerID(int medewerkerID) {
        this.MedewerkerID = medewerkerID;
    }

    public Bibliotheek getBibliotheek() {
        return this.Bibliotheek;
    }

    public void setBibliotheek(Bibliotheek bibliotheek) {
        this.Bibliotheek = bibliotheek;
    }

    @Override
    public String toString() {
        return "Bibliothecaris: \nVoornaam: " + getVoornaam() + '\n' +
                "Achternaam: " + getAchternaam() + '\n' +
                "MedewerkerID: " + getMedewerkerID() + '\n' +
                "Werkt bij Bibliotheek: " + getBibliotheek().getNaam() + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bibliothecaris)) return false;
        if (!super.equals(o)) return false;

        Bibliothecaris that = (Bibliothecaris) o;

        if (MedewerkerID != that.MedewerkerID) return false;
        return Bibliotheek != null ? Bibliotheek.equals(that.Bibliotheek) : that.Bibliotheek == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + MedewerkerID;
        result = 31 * result + (Bibliotheek != null ? Bibliotheek.hashCode() : 0);
        return result;
    }
}