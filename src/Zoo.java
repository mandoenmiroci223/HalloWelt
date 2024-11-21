// Der Inhalt einer Klasse, beschreibt das Verhalten von Objekten.
public class Zoo {

    // Bei der Main methode beginnt das Programm.
    public static void main(String[] args){

        /* Ein Objekt der Klasse: Papagei wird erzeugt und in eine Variable: alex gespeichert.
        * Der Wert des Attributes wird über den Paramter bei Objekterzeugung gesetzt. */
        Papagei alex = new Papagei("Alex");

        // Die Methode wird auf das erzeugte Objekt "alex" aufgerufen.
        alex.sagHallo();

        // Diese Zeilenausgabe ruft eine Methode auf die einen String Wert zurückgibt.
        System.out.println(alex.sagHallo2());

        /* Dieser Methodenaufruf erwartet jetzt zwei Parameter und wird aber nur einen Integer Wert aussgeben.
        *
        * alex.sag(90, "Wie geht's, Wie geht's?");
        *
        oder */

        int aussage = 90;
        String weitereAussage = "Wie geht's, Wie geht's?";
        alex.sag(aussage, weitereAussage);

        // Hier wird der Konstruktor angewendet und der name wird von x zu y gesetzt.
        alex.getName();
        alex.setName("Paco");
        // Test (Aufruf von Methode)
        alex.sagNamen();

        //
    }
}

// Papagei polly = new Papagei("Polly");