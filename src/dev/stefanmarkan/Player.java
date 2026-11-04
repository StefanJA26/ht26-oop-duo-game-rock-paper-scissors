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

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    @Override
    public String toString() {
        return String.format("""
                Player: %s
                score: %d
                rounds: %d""",
                getName(), getHighscore(), getNumberOfRounds());
    }
}
