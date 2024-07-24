package baseball.message;

public class Message {
    static public String ballMessage(int cnt){
        return cnt + "볼 ";
    }

    static public String oneStrike(){
        return "1스트라이크";
    }

    static public String twoStrike(){
        return "2스트라이크";
    }

    static public String threeStrike(){
        return "3스트라이크";
    }

    static public String gameMessage(){
        return "게임 종료";
    }

    static public String nothingMessage(){
        return "낫싱";
    }
}
