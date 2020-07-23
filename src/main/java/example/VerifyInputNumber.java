package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ozm
 * @date 2020/7/24 - 0:56
 */
public class VerifyInputNumber {

    List<String> inputNumbers = new ArrayList<>();

    public boolean varify(String inputNumber) {
        if (inputNumbers != null) {
            if (inputNumbers.contains(inputNumber)) {
                return false;
            }
        }
        if (inputNumber.length() != 4) {
            return false;
        }
       return true;

    }
}
