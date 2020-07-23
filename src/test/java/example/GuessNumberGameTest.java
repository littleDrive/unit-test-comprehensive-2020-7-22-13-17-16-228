package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author ozm
 * @date 2020/7/23 - 21:44
 */
public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_is_1234_given_answer_is_1234() {
        //given

        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "1234";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("4A0B", guessResult);

    }

    @Test
    void should_return_2A2B_when_guess_is_1243_given_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "1243";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("2A2B", guessResult);

    }

    @Test
    void should_return_1A1B_when_guess_is_1025_given_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "1025";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("1A1B", guessResult);

    }

    @Test
    void should_return_0A4B_when_guess_is_4321_given_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "4321";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("0A4B", guessResult);

    }

    @Test
    void should_return_0A2B_when_guess_is_2107_given_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "2107";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("0A2B", guessResult);

    }

    @Test
    void should_return_0A0B_when_guess_is_5678_given_answer_is_1234() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        Mockito.when(answerGenerator.generator()).thenReturn("1234");
        GuessNumberGame gussNumberGame = new GuessNumberGame(answerGenerator.generator());

        String guessNumber = "5678";

        //when
        String guessResult = gussNumberGame.guess(guessNumber);

        //then
        Assertions.assertEquals("0A0B", guessResult);

    }


}
