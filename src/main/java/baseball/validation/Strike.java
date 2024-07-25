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

        int result = calculateCount(cnt);
        return result != 0;
    }

    private int calculateCount(int cnt) {

        if (cnt >= 1){
            System.out.println(Message.strikeMessage(cnt));
        } else{
            cnt = 0;
        }
        return cnt;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
