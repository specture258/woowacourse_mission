package baseball.view;

public class OutputView {

    public void inputNumber(){
        System.out.print("숫자를 입력해주세요 : ");
    }


    public String ballMessage(int[] cnt){
        if(cnt[0]==0){
            return "";
        }
        return cnt[0] + "볼 ";
    }

    public String strikeMessage(int[] cnt){
        if(cnt[1]==0){
            return "";
        }
        return cnt[1] + "스트라이크 ";
    }

     public String nothingMessage(){
        return "낫싱";
    }

    public String allCorrectMessage(){
        return "3개의 숫자를 모두 맞히셨습니다!";
    }

    public String endMessage(){
        return "게임 종료 ";
    }

    public String restartMessage(){
        return "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    }


}
