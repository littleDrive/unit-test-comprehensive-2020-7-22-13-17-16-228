package example;

import java.util.HashSet;
import java.util.Random;

/**
 * @author ozm
 * @date 2020/7/24 - 0:07
 */
public class AnswerGeneratorImpl implements AnswerGenerator{
    HashSet<Integer> hashSet = new HashSet<>();
    @Override
    public String generator() {
        Random random = new Random();
        while (hashSet.size() < 4) {
            hashSet.add(random.nextInt(10));
        }
        String answer = "";
        for (Integer integer : hashSet) {
            answer += integer;
        }
        return answer;
    }
}
