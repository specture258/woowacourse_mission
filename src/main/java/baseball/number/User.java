package baseball.number;

import baseball.view.InputView;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {

    InputView input = new InputView();

    public String getInputNumber(){

        System.out.print("숫자를 입력해주세요 : ");
        String number = input.InputNumber();

        if (number.length() != 3) {
            throw new IllegalArgumentException();
        }
        return number;

    }

}
