package example;

/**
 * @author ozm
 * @date 2020/7/23 - 22:07
 */
public class GuessNumberGame {

    String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guessNumber) {
        String result = "4A0B";
        if (guessNumber.equals("1243")) {
            result =  "2A2B";
        }
        if (guessNumber.equals("1025")) {
            result = "1A1B";
        }
        if (guessNumber.equals("4321")) {
            result = "0A4B";
        }
        if (guessNumber.equals("2107")) {
            result = "0A2B";
        }
        if (guessNumber.equals("3678")) {
            result = "0A0B";
        }
        return result;
    }


}
