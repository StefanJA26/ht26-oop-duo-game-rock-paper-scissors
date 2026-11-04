public class Game {

    public boolean validateChoice(String choice) {
        return switch (choice.toLowerCase()) {
            case "rock", "paper", "scissors" ->  true;
            default ->  false;
        };
    }

    public int decideRoundWinner(String p1Choice, String p2Choice) {

        if (p1Choice.equalsIgnoreCase(p2Choice))
            return 0;

        if (p1Choice.equalsIgnoreCase("rock")) {
            if (p2Choice.equalsIgnoreCase("scissors")) {
                return 1;
            } else {
                return 2;
            }
        }

        if (p1Choice.equalsIgnoreCase("paper")) {
            if (p2Choice.equalsIgnoreCase("rock")) {
                return 1;
            } else {
                return 2;
            }
        }

        if (p1Choice.equalsIgnoreCase("scissors")) {
            if (p2Choice.equalsIgnoreCase("paper")) {
                return 1;
            } else {
                return 2;
            }
        }

        return 4;
    }
}