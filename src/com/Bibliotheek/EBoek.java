package com.Bibliotheek;
public class EBoek extends Boek {

    public EBoek(String Titel, int Paginas, int UitgaveJaar) {
        super(Titel, Paginas, UitgaveJaar);
    }
    // Eboek huren veranderd niet beschikbaarheid
    public void Huren() {
        if(!getBeschikbaar()) {System.out.println("Niet Beschikbaar!");}
    }
}