package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ozm
 * @date 2020/7/26 - 23:27
 */
public class GuessNumberGameProcessTest {

    @Test
    void should_return_Wrong_input_input_again_when_input_incrroct_number_given_12() {
        //given
        GuessNumberGameProcess guessNumberGameProcess = new GuessNumberGameProcess();
        String inputNumber = "12";

        //when
        String outPutMassage = guessNumberGameProcess.begin(inputNumber);

        //then
        Assertions.assertEquals("Wrong Input，Input again", outPutMassage);
    }
}
