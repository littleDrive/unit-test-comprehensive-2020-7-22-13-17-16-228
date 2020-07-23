package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ozm
 * @date 2020/7/23 - 21:44
 */
public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_is_1234_given_answer_is_1234() {
        //given
        GuessNumberGame gussNumberGame = new GuessNumberGame("1234");
        String guessNumber = "1234";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("4A0B", guessResult);

    }

    @Test
    void should_return_2A2B_when_guess_is_1243_given_answer_is_1234() {
        //given
        GuessNumberGame gussNumberGame = new GuessNumberGame("1234");
        String guessNumber = "1243";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("2A2B", guessResult);

    }

    @Test
    void should_return_1A1B_when_guess_is_1025_given_answer_is_1234() {
        //given
        GuessNumberGame gussNumberGame = new GuessNumberGame("1234");
        String guessNumber = "1025";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("1A1B", guessResult);

    }


}
