package GamePlay;

/**
 * @version 1
 * class main of Poker package game
 */
public class main {

    /**
     * main driver for program; everything is done in GameMaster class which
     * invokes the other class methods.
     */
    public main() {
        GameExperience board = new GameExperience(); // set board up
        board.gameplay(); // run game
    }

    public static void main(String[] args) {
        main m = new main();
    }
}
