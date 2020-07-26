package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author ozm
 * @date 2020/7/24 - 0:56
 */
public class VerifyInputNumber {

    List<String> inputNumbers = new ArrayList<>();
    HashSet<String> hashSet = new HashSet<>();

    public boolean varify(String inputNumber) {

        int i = 0;
        while (i < 4) {
            hashSet.add(String.valueOf(inputNumber.charAt(i)));
            i++;
        }
        if (inputNumber.length() != 4 || hashSet.size() != 4) {
            return false;
        }
        return true;

    }
}
