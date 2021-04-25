package com.Bibliotheek;
public class Klant extends Persoon {

    private int KlantID;

    public Klant(String voornaam, String achternaam, int klantID) {
        super(voornaam, achternaam);
        KlantID = klantID;
    }

    public int getKlantID() {
        return KlantID;
    }

    public void setKlantID(int klantID) {
        KlantID = klantID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klant)) return false;
        if (!super.equals(o)) return false;

        Klant klant = (Klant) o;

        return KlantID == klant.KlantID;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + KlantID;
        return result;
    }
}