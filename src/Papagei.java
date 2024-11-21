// Der Inhalt einer Klasse, beschreibt das Verhalten von Objekten.
public class Papagei {

    /* Das sind Verschiedene Variablen, die aktuell gespeichert sind und im laufe des Programmes verändert und berechnet werden können.
    * Diese Variablen besitzen Datentypen die angegeben werden müssen. */
    double groeße = 100.0;
    int alter = 15;
    boolean muede = false;
    boolean hungrig = true;

    /* Objekte besitzen Attribute die hier einen Zustand speichern, es ist möglich ihn später zu verändern (z.B mit einer Methode).
    * Die Attribute erzeugt man wie Variablen, jedoch am Anfang der Klasse um Sie Zugreifbar zu machen. */
    private String name;


    /* Hier wird ein Konstruktor gebaut.
    * Man kann die Werte von Attributen bei Objekterzeugung über Parameter setzen. */
        public Papagei(String name){
            this.name = name;
        }

    /*
    * Zugriff von außen über die Getter und Setter-Methode, d.h. das Attribut kann verändert werden.
    * Definition:
    * Da das Attribut von außen geschützt ist benötigt es die Getter und Setter um von außen Zugreifen zu können.
     */
    // Getter Methode:
        public String getName(){
            return name;
        }
    // Setter Methode:
         public void setName(String name){
            this.name = name;
        }

    // Das Verhalten von Objekten wird repräsentiert durch Methoden. In diesem Fall gibt die Methode eine Zeilenausgabe zurück.
            void sagHallo() {
                System.out.println("Hallo!");
            }

    // Diese Methode gibt ein String (oder z.B. int, boolean etc.) als Rückgabewert zurück.
            String sagHallo2(){
                return "Halloooo!";
            }

    /* Das ist eine Methode die bei Aufruf einen Parameter übergeben haben will.
    * Denn diese Methode erwartet einen Eingabewert.
    * WIchtig ist den Datentyp anzugeben.
     */
            public void sag(int aussage, String weitereAussage){
                System.out.println(aussage);
            }
    // Die Methode Testet die Änderung indem Sie den Aktuellen Stand Attribut "name" ausgibt.
            public void sagNamen(){
                System.out.println("Hallo ich bin: " + name);
            }


}