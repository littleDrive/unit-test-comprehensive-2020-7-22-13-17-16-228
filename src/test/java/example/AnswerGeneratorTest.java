package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author ozm
 * @date 2020/7/24 - 0:06
 */
public class AnswerGeneratorTest {
    @Test
    void should_return_a_valid_answer_when_call_generator_given_nothing() {
        //given
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();

        //when
        String answer = answerGenerator.generator();

        //then
        Assertions.assertTrue( answer != null);
        Assertions.assertEquals(4, answer.length());
//        Assertions.assertTrue(Integer.valueOf(answer.charAt(0))<=9 && Integer.valueOf(answer.charAt(0))>=0);
//        Assertions.assertTrue(Integer.valueOf(answer.charAt(1))<=9 && Integer.valueOf(answer.charAt(1))>=0);
//        Assertions.assertTrue(Integer.valueOf(answer.charAt(2))<=9 && Integer.valueOf(answer.charAt(2))>=0);
//        Assertions.assertTrue(Integer.valueOf(answer.charAt(3))<=9 && Integer.valueOf(answer.charAt(3))>=0);
    }
}
