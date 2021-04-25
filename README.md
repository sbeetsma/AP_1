# AP_1
AP 1. Domain Design &amp; Implementatie.
Java systeem voor een bibliotheek om leningen bij te houden.
Business rules:
	Boeken en Films kunnen maar 1 keer tegelijk gehuurd worden, een EBoek blijft beschikbaar ookal is het al gehuurd.
	Als er een lening gedaan wordt waar objecten inzitten die niet geleend kunnen worden, wordt de rest wel uitgeleend.
	Wanneer leenbare objecten terug zijn gekeerd kunnen ze weer uitgeleend worden.

Voer het bestand src/Main.java uit zodat de code gerunned wordt.

Leenbaar: interface voor alle leenbare objecten.
Boek: Boek class
EBoek: EBoek class, extensie van Boek
Film: Film class
Lening: De lening gebonden aan een lijst van leenbare objecten, een klant en een bibliotheek
Bibliotheek: Bibliotheek class
Bibliothecaris: Extensie van persoon
Klant: Extensie van persoon
Persoon: Persoon class
