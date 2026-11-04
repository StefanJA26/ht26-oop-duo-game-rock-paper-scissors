public class Player {
    private String name;
    private int highscore;
    private int numberOfRounds;

    public Player(String name) {
        this.name = name;
        this.highscore = 0;
        this.numberOfRounds = 0;
    }

    public String getName() {
        return name;
    }

    public int getHighscore() {
        return highscore;
    }

    public void incrementHighscore() {
        highscore++;
    }

    public void incrementRounds() {
        numberOfRounds++;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    @Override
    public String toString() {
        return String.format("""
                Player: %s
                Score: %d
                Rounds: %d
                """,
                getName(), getHighscore(), getNumberOfRounds());
    }
}
