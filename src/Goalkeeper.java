import java.time.LocalDate;

public class Goalkeeper extends Player{
    public Goalkeeper(String name, LocalDate birthday, int playerStrength) {
        super(name, birthday, playerStrength);
    }

    @Override public String getFunction(){
        return "Torwart";
    }
}
