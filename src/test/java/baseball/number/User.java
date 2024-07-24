package baseball.number;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {
    String inputNumber;

    public String getInputNumber(){

        System.out.print("숫자를 입력해주세요 : ");
        inputNumber = readLine();

        if (inputNumber.length() != 3) {
            throw new IllegalArgumentException();
        }
        return inputNumber;

    }
}
