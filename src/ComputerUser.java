import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerUser implements players {

    private String computerChoice;
    List<String> choices = Arrays.asList("rock", "paper", "scissors");


    @Override
    public void setChoice() {
        Random random = new Random();
        int index = random.nextInt(choices.size());
        this.computerChoice = choices.get(index);
    }

    public String getChoice (){
        return computerChoice;
    }
}
