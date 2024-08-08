package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    private final InputViewValidation inputViewValidation;

    public InputView(InputViewValidation inputViewValidation) {
        this.inputViewValidation = inputViewValidation;
    }

    public String InputUserNumber(){
        String input =  readLine();
        inputViewValidation.validateLength(input);
        inputViewValidation.validateNumber(input);
        inputViewValidation.validateDuplicate(input);
        return input;
    }

    public String InputCommand(){
         String input = readLine();
         inputViewValidation.validateCommand(input);
         return input;
    }

}
