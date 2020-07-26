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

        int rightPosition = getRightPosition(guessNumber);
        int rightNuberButPosition = getRightNuberButPosition(guessNumber,rightPosition);
        return String.format("%dA%dB", rightPosition,rightNuberButPosition);
    }


    public int getRightPosition(String guessNumber) {
        int rightPosition = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (guessNumber.charAt(i) == answer.charAt(i)) {
                rightPosition++;
            }
        }
        return rightPosition;
    }
    public int getRightNuberButPosition(String guessNumber, int countA) {
        int rightNuberButPosition = 0;
        for (int i = 0; i < guessNumber.length(); i++) {
            if (answer.contains(String.valueOf(guessNumber.charAt(i)))) {
                rightNuberButPosition++;
            }
        }
        return rightNuberButPosition - countA;
    }



}
