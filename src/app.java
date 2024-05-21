public class app {
    public static void main(String[] args) {
        User user = new User();


        user.setName();
        user.setChoice();


        System.out.println("User's name: " + user.getName());
        System.out.println(user.getName()+" has chosen " + user.getChoice());

        ComputerUser computerUser = new ComputerUser();
        computerUser.setChoice();
        System.out.println("Computer has chosen " + computerUser.getChoice());



        Game game = new Game();

        while (true) {
            boolean notTie = game.playGame(user, computerUser);
            if (notTie) {
                break;
            } else {
                user.setChoice();
                System.out.println(user.getName()+" has chosen " + user.getChoice());
                computerUser.setChoice();
                System.out.println("Computer has chosen " + computerUser.getChoice());
            }
        }

    }
}
