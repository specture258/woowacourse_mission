package baseball.validation;

import baseball.message.Message;

public class Strike implements Correctable{
    int cnt =0;
    @Override
    public boolean isCorrect(String[] input, String[] answer) {
        int pointer =0;
        for (String s : input) {
            if (s.equals(answer[pointer])) {
                cnt++;
            }
            pointer++;
        }

        if (cnt == 3){
            System.out.println(Message.threeStrike());
            return true;
        } else if (cnt == 2){
            System.out.println(Message.twoStrike());
            return true;
        } else if (cnt == 1){
            System.out.println(Message.oneStrike());
            return true;
        } else{
            return false;
        }
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
