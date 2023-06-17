import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // create new team
        Team teamDE = new Team("Deutschland");
        teamDE.create();

        Team teamGB = new Team("England");
        teamGB.create();

        System.out.println("Mannschaftsstärke Deutschland: " + teamDE.getPower());
        System.out.println("Mannschaftsstärke England: " + teamGB.getPower());

        // zu a)
        Player spieler1 = new Player("S1",
                LocalDate.of(1987, 8, 27), 9);
        /*
         * Die Ausgabe ist Spieler,
         * da Methoder getFunction() in der Basisklasse definiert
         * und nicht überschrieben wurde
         */
        System.out.println("Spieler1: " + spieler1.getFunction());

        // zu b)
        Goalkeeper torwart = new Goalkeeper("Torwart",
                LocalDate.of(1991, 6, 27), 6);
        /*
         * Die Ausgabe ist Torwart,
         * weil die Methode getFunction() in der
         * abgeleiteten Klasse überschrieben wurde
         */
        System.out.println("Torwart: " + torwart.getFunction());

        // zu c)
        Player spieler2 = new Midfielder("S2",
                LocalDate.of(2000, 3, 8), 3);
        /*
         * Die Ausgabe ist Mittelfeldspieler,
         * weil die Methode getFunction() in der
         * abgeleiteten Klasse überschrieben wurde
         */
        System.out.println("Spieler2: " + spieler2.getFunction());
    }
}