package baseball.validation;

import baseball.message.Message;

public class Ball implements Correctable {

    @Override
    public boolean isCorrect(String[] input, String[] answer) {
        int cnt=0;

        if ( input[0].equals(answer[1]) || input[0].equals(answer[2])){
            cnt++;
        }
        if (input[1].equals(answer[0]) || input[1].equals(answer[2])){
            cnt++;
        }
        if (input[2].equals(answer[0]) || input[2].equals(answer[1])){
            cnt++;
        }

        if (cnt == 0){
            return false;
        }

        System.out.print(Message.ballMessage(cnt));
        return true;

    }

}
