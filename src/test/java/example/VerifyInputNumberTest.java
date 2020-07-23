package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ozm
 * @date 2020/7/24 - 0:57
 */
public class VerifyInputNumberTest {
    @Test
    void should_return_if_1234_is_varify_when_call_varifyNumber_given_1234() {
        //given
        String inputNumber = "1234";
        VerifyInputNumber verifyInputNumber = new VerifyInputNumber();

        //when
        boolean isVarify = verifyInputNumber.varify();

        //then
        Assertions.assertTrue(isVarify);
    }
}
