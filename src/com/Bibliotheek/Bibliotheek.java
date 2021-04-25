package com.Bibliotheek;
public class Bibliotheek {

    private String Naam;
    private String Stad;

    public Bibliotheek(String naam, String stad) {
        this.Naam = naam;
        this.Stad = stad;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getStad() {
        return Stad;
    }

    public void setStad(String stad) {
        Stad = stad;
    }

    @Override
    public String toString() {
        return "Bibliotheek: " + getNaam() + '\n' +
                "In de stad: " + getStad() + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bibliotheek)) return false;

        Bibliotheek that = (Bibliotheek) o;

        if (Naam != null ? !Naam.equals(that.Naam) : that.Naam != null) return false;
        return Stad != null ? Stad.equals(that.Stad) : that.Stad == null;
    }

    @Override
    public int hashCode() {
        int result = Naam != null ? Naam.hashCode() : 0;
        result = 31 * result + (Stad != null ? Stad.hashCode() : 0);
        return result;
    }
}