import java.time.LocalDate;

public class Team{
    private String nation;
    private Goalkeeper goalkeeper;
    private Defense[] defenses;
    private Midfielder[] midfielders;
    private Striker[] strikers;


    public Team(String nation) {
        this.nation = nation;
        defenses = new Defense[4];
        midfielders = new Midfielder[3];
        strikers = new Striker[3];
    }

    public int rndStrength(){
        int maxStrength = 9;
        int minStrength = 1;
        int strengthRange = maxStrength - minStrength + 1;
        int strength = (int) (Math.random() * strengthRange) + minStrength;
        return strength;
    }

    /**
     * create each player of a team
     */
    public void create(){

        // create goalkeeper
        goalkeeper = new Goalkeeper("Goalkeeper",
                LocalDate.of(1987,8,27),rndStrength());

        // create defense player - max 4
        for (int i = 0; i < defenses.length; i++){
            defenses[i] = new Defense("Defense" + (i + 1),
                    LocalDate.of(1991, 6, 27), rndStrength());
        }

        // create midfield player - max 3
        for (int i = 0; i < midfielders.length; i++){
            midfielders[i] = new Midfielder("Midfield" + (i + 1),
                    LocalDate.of(2000, 3, 8), rndStrength());
        }

        // create striker - max 3
        for (int i = 0; i < strikers.length; i++){
            strikers[i] = new Striker("Striker" + (i + 1),
                    LocalDate.of(2009, 4, 14), rndStrength());
        }
    }

    /**
     * calculates Team strength
     * @return
     */
    public int getPower(){
        int maxStrength = goalkeeper.playerStrength;

        for(Defense defense : defenses){
            maxStrength += defense.playerStrength;
        }

        for (Midfielder midfielder : midfielders){
            maxStrength += midfielder.playerStrength;
        }

        for (Striker striker : strikers){
            maxStrength += striker.playerStrength;
        }

        return maxStrength;
    }
}
