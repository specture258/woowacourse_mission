package baseball.domain.number;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class AnswerNumber {
    public  List<Integer> createRandomNumber() {
        int INPUT_NUMBER_LENGTH = 3;
        Set<Integer> set = new LinkedHashSet<>();

        validRandomNumber(set, INPUT_NUMBER_LENGTH);
        return new ArrayList<>(set);
    }

    private static void validRandomNumber(Set<Integer> set, int INPUT_NUMBER_LENGTH) {
        while(set.size() != INPUT_NUMBER_LENGTH) {
            set.add(pickNumberInRange(1, 9));
        }
    }

}
