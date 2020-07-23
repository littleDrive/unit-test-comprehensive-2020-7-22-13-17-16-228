package example;

import java.util.Random;

/**
 * @author ozm
 * @date 2020/7/24 - 0:07
 */
public class AnswerGeneratorImpl implements AnswerGenerator{
    @Override
    public String generator() {
        Random random = new Random();
        String answer = "";
        for(int i = 0; i < 4; i++) {
            answer += random.nextInt(10);
        }
        return answer;
    }
}
