package baseball.view;

import java.util.LinkedHashSet;
import java.util.Set;

public class InputViewValidation {

    public void validateLength(String number){
        int INPUT_NUMBER_LENGTH = 3;
        if(number.length() != INPUT_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public void validateNumber(String number){
         for(char c : number.toCharArray()) {
             if(!Character.isDigit(c)) {
                 throw new IllegalArgumentException();
             }
         }
    }

    public void validateDuplicate(String number){
        Set<Character> uniqueDigits = new LinkedHashSet<>();
        for(char c : number.toCharArray()) {
            if(c < '1' || c > '9') {
                continue;
            }
            uniqueDigits.add(c);
        }

        if(uniqueDigits.size() != number.length()){
            throw new IllegalArgumentException();
        }
    }

    public void validateCommand(String command){
        if(!command.equals("1") && !command.equals("2")) {
            throw new IllegalArgumentException();
        }
    }

}
