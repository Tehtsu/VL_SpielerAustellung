import java.time.LocalDate;

public class Defense extends Player {
    public Defense(String name, LocalDate birthday, int playerStrength) {
        super(name, birthday, playerStrength);
    }

    @Override
    public String getFunction() {
        return "Abwehrspieler";
    }
}
