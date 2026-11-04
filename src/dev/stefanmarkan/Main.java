import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            clearScreen();
            System.out.println("Welcome to the Rock, Paper and Scissor game!");

            System.out.println("Name player one.");
            String playername1 = scanner.nextLine();
            System.out.println("Name player two.");
            String playername2 = scanner.nextLine();

            Player p1 = new Player(playername1);
            Player p2 = new Player(playername2);

            String p1Choice;
            String p2Choice;
            int roundCount = 0;
            mainLoop: while (true) {
                clearScreen();
                roundCount++;
                System.out.println("Round: " + roundCount);

                System.out.print("Player 1 (rock, paper, scissor. quit to quit): ");
                do {
                    p1Choice = scanner.nextLine();
                    p1Choice = p1Choice.toLowerCase();
                    if (p1Choice.equalsIgnoreCase("quit")) break mainLoop;
                } while (!Game.validateChoice(p1Choice));

                clearScreen();
                System.out.println("Round: " + roundCount);

                System.out.print("Player 2 (rock, paper, scissor. exit to quit): ");
                do {
                    p2Choice = scanner.nextLine();
                    p2Choice = p2Choice.toLowerCase();
                    if (p2Choice.equalsIgnoreCase("quit")) break mainLoop;
                } while (!Game.validateChoice(p2Choice));

                switch (Game.decideRoundWinner(p1Choice, p2Choice)) {
                    case 0 -> {
                        System.out.println("Round tied");
                    }
                    case 1 -> {
                        p1.incrementHighscore();
                        System.out.println("P1 winds the round");
                    }
                    case 2 -> {
                        p2.incrementHighscore();
                        System.out.println("P2 Wins the round!!!!!OMG OMG");
                    }
                    default -> {
                        System.err.println("Something broke");
                    }
                };
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Wait was interrupted");
                }
            }
            clearScreen();
            System.out.println(p1.toString());
            System.out.println(p2.toString());

        }

    }
}
