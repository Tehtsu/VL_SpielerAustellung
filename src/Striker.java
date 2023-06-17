import java.time.LocalDate;

public class Striker extends Player {
    public Striker(String name, LocalDate birthday, int playerStrength) {
        super(name, birthday, playerStrength);
    }

    @Override
    public String getFunction() {
        return "Stürmer";
    }
}
