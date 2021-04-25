package com.Bibliotheek;
public class Persoon {

    private String Voornaam;
    private String Achternaam;

    public Persoon(String voornaam, String achternaam) {
        this.Voornaam = voornaam;
        this.Achternaam = achternaam;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.Voornaam = voornaam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.Achternaam = achternaam;
    }

    public String toString() {
        return "Voornaam: " + getVoornaam() + '\n' +
                "Achternaam: " + getAchternaam() + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persoon)) return false;

        Persoon persoon = (Persoon) o;

        if (Voornaam != null ? !Voornaam.equals(persoon.Voornaam) : persoon.Voornaam != null) return false;
        return Achternaam != null ? Achternaam.equals(persoon.Achternaam) : persoon.Achternaam == null;
    }

    @Override
    public int hashCode() {
        int result = Voornaam != null ? Voornaam.hashCode() : 0;
        result = 31 * result + (Achternaam != null ? Achternaam.hashCode() : 0);
        return result;
    }
}

