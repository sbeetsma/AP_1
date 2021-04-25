package com.Bibliotheek;
public class Film implements Leenbaar {

    private String Titel;
    private String Beschrijving;
    private boolean Beschikbaar;
    private int Speelduur;
    private int UitgaveJaar;

    public Film(String titel, int speelduur, int uitgaveJaar) {
        Titel = titel;
        Speelduur = speelduur;
        UitgaveJaar = uitgaveJaar;
        this.Beschikbaar = true;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getBeschrijving() {
        return Beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        Beschrijving = beschrijving;
    }

    public boolean getBeschikbaar() {
        return Beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        Beschikbaar = beschikbaar;
    }

    public int getSpeelduur() {
        return Speelduur;
    }

    public void setSpeelduur(int speelduur) {
        Speelduur = speelduur;
    }

    public int getUitgaveJaar() {
        return UitgaveJaar;
    }

    public void setUitgaveJaar(int uitgaveJaar) {
        UitgaveJaar = uitgaveJaar;
    }

    public void Huren() {
        if (this.Beschikbaar) {
            this.Beschikbaar = false;
        } else {
            System.out.println(getTitel() + "is niet Beschikbaar!");
        }
    }

    public void Inleveren() {
        System.out.println();
        this.Beschikbaar = true;
    }

    public String toString() {
        return "Titel: " + getTitel() + "\nJaar van uitgave" + getUitgaveJaar() + "\nSpeelduur in minuten: " + getSpeelduur() + "\nbeschrijving:" + getBeschrijving() + "\nBeschikbaarheid: " + BeschikbaarheidToString();
    }

    public String BeschikbaarheidToString(){
        if(!this.Beschikbaar){return "Niet beschikbaar";}else{return "Beschikbaar";}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;

        Film film = (Film) o;

        if (Speelduur != film.Speelduur) return false;
        if (UitgaveJaar != film.UitgaveJaar) return false;
        return Titel != null ? Titel.equals(film.Titel) : film.Titel == null;
    }

    @Override
    public int hashCode() {
        int result = Titel != null ? Titel.hashCode() : 0;
        result = 31 * result + Speelduur;
        result = 31 * result + UitgaveJaar;
        return result;
    }
}