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

        int numberOfA = getNumberOfA(guessNumber);
        int numberOfB = getNumberOfB(guessNumber,numberOfA);
        return String.format("%dA%dB", numberOfA,numberOfB);
    }


    public int getNumberOfA(String guessNumber) {
        int countA = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (guessNumber.charAt(i) == answer.charAt(i)) {
                countA++;
            }
        }
        return countA;
    }
    public int getNumberOfB(String guessNumber, int countA) {
        int countB = 0;
        for (int i = 0; i < guessNumber.length(); i++) {
            if (answer.contains(String.valueOf(guessNumber.charAt(i)))) {
                countB++;
            }
        }
        return countB - countA;
    }



}
