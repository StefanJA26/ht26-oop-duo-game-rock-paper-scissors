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

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
