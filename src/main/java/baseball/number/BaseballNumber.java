package baseball.number;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumber {

    public List<Integer> createBaseballNumber(String userInputNumber) {
        List<Integer> baseballNumber = new ArrayList<>();
        for(int i=0 ; i<userInputNumber.length() ;i++){
            int number = Character.getNumericValue(userInputNumber.charAt(i));
            baseballNumber.add(number);
        }
        return baseballNumber;
    }


}
