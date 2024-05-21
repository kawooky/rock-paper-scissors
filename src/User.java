import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User implements players {

    private String name;
    private String playerChoice;
    List<String> choices = Arrays.asList("rock", "paper", "scissors");


    Scanner user_input = new Scanner(System.in);

    public void setName(){
        System.out.println("Please enter your name");
        this.name = user_input.next();
    }

    public void setChoice(){
        while (true) {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            playerChoice = user_input.next();
            if (choices.contains(playerChoice)) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public String getName (){
        return name;
    }

    public String getChoice (){
        return playerChoice;
    }

}

