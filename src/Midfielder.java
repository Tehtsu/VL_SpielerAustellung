import java.time.LocalDate;

public class Midfielder extends Player {
    public Midfielder(String name, LocalDate birthday, int playerStrength) {
        super(name, birthday, playerStrength);
    }

    @Override
    public String getFunction() {
        return "Mittelfeldspieler";
    }
}
