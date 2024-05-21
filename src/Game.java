import java.util.Objects;

public class Game {
    public boolean playGame(User user, ComputerUser computerUser) {
        switch (user.getChoice()) {
            case "rock":
                if (Objects.equals(computerUser.getChoice(), "scissors")) {
                    System.out.println("Smash! You win!");
                    return true;
                } else if (Objects.equals(computerUser.getChoice(), "paper")) {
                    System.out.println("Ahhhhhh ur surrounded! You lose!");
                    return true;
                } else {
                    System.out.println("Draw! Rematch!");
                    return false;
                }
            case "paper":
                if (Objects.equals(computerUser.getChoice(), "rock")) {
                    System.out.println("You wrapped him up! You win!");
                    return true;
                } else if (Objects.equals(computerUser.getChoice(), "scissors")) {
                    System.out.println("You got snipped up! You lose!");
                    return true;
                } else {
                    System.out.println("Draw! Rematch!");
                    return false;
                }

            case "scissors":
                if (Objects.equals(computerUser.getChoice(), "paper")) {
                    System.out.println("Snip Snip! You win!");
                    return true;
                } else if (Objects.equals(computerUser.getChoice(), "rock")) {
                    System.out.println("He was rock hard! You lose!");
                    return true;
                } else {
                    System.out.println("Draw! Rematch!");
                    return false;
                }
        }

        return false;
    }
}

