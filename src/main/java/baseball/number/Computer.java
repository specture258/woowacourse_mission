package baseball.number;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {

    public String createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();

        while(set.size() != 3) {
            set.add(pickNumberInRange(1, 9));
        }
        return  set.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
