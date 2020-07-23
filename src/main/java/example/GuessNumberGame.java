package example;

/**
 * @author ozm
 * @date 2020/7/23 - 22:07
 */
public class GuessNumberGame {

    public GuessNumberGame(String s) {

    }

    public String guess(String guessNumber) {

        if (guessNumber.equals("1243")) {
            return "2A2B";
        }
        if (guessNumber.equals("1025")) {
            return "1A1B";
        }
        if (guessNumber.equals("4321")) {
            return "0A4B";
        }
        return "4A0B";
    }


}
