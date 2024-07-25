package baseball.message;

public class Message {
    static public String ballMessage(int cnt){
        return cnt + "볼 ";
    }

    static public String strikeMessage(int cnt){
        return cnt + "스트라이크 ";
    }

    static public String gameMessage(){
        return "게임 종료";
    }

    static public String nothingMessage(){
        return "낫싱";
    }
}
