package com.Bibliotheek;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bibliotheek DeBieb = new Bibliotheek("De Bieb", "Utrecht");

        Klant Klant1a = new Klant("Sjoerd", "Beetsma", 1);

        Bibliothecaris Bibliothecaris1a = new Bibliothecaris("Jan", "De Vries", 1, DeBieb);
        System.out.println(Bibliothecaris1a.toString());
        // normale boeken
        Boek Boek1a = new Boek("Harry Potter en de Steen der Wijzen", 232, 1998);
        Boek Boek2a = new Boek("Het gouden ei", 12, 2018);
        // e boeken
        EBoek eBoek1a = new EBoek("Harry Potter en de Steen der Wijzen", 232, 1998);
        EBoek eBoek2a = new EBoek("Het diner", 300, 2009);
        // films
        Film Film1a = new Film("The Lord of the Rings: The Fellowship of the Ring", 228, 2001);
        // lening met 2 * boek, 1 * eboek, 1 * film
        Lening Lening1a = new Lening(new ArrayList<>(Arrays.asList(Boek1a, Boek2a, eBoek2a, Film1a)), DeBieb, Klant1a);
        Lening1a.Huur();
        System.out.println("Lening1a: \n"+ Lening1a.toString());
        // eboek kan opnieuw uitgeleend worden
        Lening Lening2a = new Lening(new ArrayList<>(Arrays.asList(eBoek1a, eBoek2a)), DeBieb, Klant1a);
        Lening2a.Huur();
        System.out.println("Lening2a: \n"+ Lening2a.toString());
        // boek en film kunnen niet opnieuw uitgeleend worden
        System.out.println("Lening3a:");
        Lening Lening3a = new Lening(new ArrayList<>(Arrays.asList(Boek1a, Boek2a, Film1a)), DeBieb, Klant1a);
        Lening3a.Huur();
        // eerste lening inleveren
        Lening1a.Inleveren();
        // boek en film kan weer worden uitgeleend
        Lening Lening4a = new Lening(new ArrayList<>(Arrays.asList(Boek1a, Boek2a, Film1a)), DeBieb, Klant1a);
        Lening4a.Huur();
        System.out.println("Lening4a: \n"+ Lening4a.toString());
        // Boek en eBoek zijn hetzelfde als ze dezelfde naam en uitgave jaar hebben
        System.out.println("Boek1a == eBoek1a: " + Boek1a.equals(eBoek1a));

        System.out.println("Boek1a == eBoek1a: "+Boek1a.equals(Boek1a));

        System.out.println("Boek1a == eBoek2a: "+Boek1a.equals(Boek2a));



    }
}
