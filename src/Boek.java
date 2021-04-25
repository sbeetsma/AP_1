public class Boek implements Leenbaar {

    private String Titel;
    private String Beschrijving;
    private boolean Beschikbaar;
    private int Paginas;
    private int UitgaveJaar;

    public Boek(String Titel, int Paginas, int UitgaveJaar) {
        this.Titel = Titel;
        this.Paginas = Paginas;
        this.Beschikbaar = true;
        this.UitgaveJaar = UitgaveJaar;
    }

    public int getPaginas() {
        return this.Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public String getTitel() {
        return this.Titel;
    }

    public void setTitel(String Titel) {
        this.Titel = Titel;
    }

    public String getBeschrijving() {
        return this.Beschrijving;
    }

    public void setBeschrijving(String Beschrijving) {
        this.Beschrijving=Beschrijving;
    }

    public boolean getBeschikbaar() {
        return Beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        Beschikbaar = beschikbaar;
    }

    public int getUitgaveJaar() {
        return UitgaveJaar;
    }

    public void setUitgaveJaar(int uitgaveJaar) {
        UitgaveJaar = uitgaveJaar;
    }

    public void Huren() {
        if(this.Beschikbaar){this.Beschikbaar = false;}else{
            System.out.println("Niet Beschikbaar!");
        }
    }

    public void Inleveren() {
        this.Beschikbaar = true;
    }

    public String toString() {
        return "Titel: " + getTitel() + "\nJaar van uitgave: " + getUitgaveJaar() + "\naantal pagina's: " + getPaginas() + "\nbeschrijving:" + getBeschrijving() + "\nBeschikbaarheid: " + BeschikbaarheidToString();
    }

    public String BeschikbaarheidToString(){
        if(!this.Beschikbaar){return "Niet beschikbaar";}else{return "Beschikbaar";}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boek)) return false;

        Boek boek = (Boek) o;

        if (Paginas != boek.Paginas) return false;
        if (UitgaveJaar != boek.UitgaveJaar) return false;
        return Titel != null ? Titel.equals(boek.Titel) : boek.Titel == null;
    }

    @Override
    public int hashCode() {
        int result = Titel != null ? Titel.hashCode() : 0;
        result = 31 * result + Paginas;
        result = 31 * result + UitgaveJaar;
        return result;
    }
}