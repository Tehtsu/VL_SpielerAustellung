import java.time.LocalDate;

public class Player {

    // Attributes
    private String name;
    private LocalDate birthday;
    protected int playerStrength;

    // Constructor
    public Player(String name, LocalDate birthday, int playerStrength) {
        this.name = name;
        this.birthday = birthday;
        this.playerStrength = playerStrength;
    }

    public String getFunction(){
        return "Spieler";
    }
}
