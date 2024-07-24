package baseball.controller;

import baseball.number.Computer;
import baseball.number.User;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Game {

    Ball ball = new Ball();
    Strike strike = new Strike();
    private boolean exit = false;

    public void play(){

        Computer computer = new Computer();
        String computerInputNumber = computer.createRandomNumber();
        while(!exit){
            flow(ball, strike, computerInputNumber );
        }
    }


    public void flow(Ball ball, Strike strike, String computerInputNumber){
        User user = new User();
        String userInputNumber = user.getInputNumber();
        strike.setCnt(0);

        boolean ballCorrect = ball.isCorrect(StrToStrArr(userInputNumber), StrToStrArr(computerInputNumber));
        boolean strikeCorrect = strike.isCorrect(StrToStrArr(userInputNumber), StrToStrArr(computerInputNumber));

        if(strike.getCnt()== 3){
            System.out.print("3개의 숫자를 모두 맞히셨습니다! ");
            System.out.println(Message.gameMessage());
            chooseOption();
        }
        if(!ballCorrect && !strikeCorrect) {
            System.out.println(Message.nothingMessage());
        }

        if(ballCorrect && !strikeCorrect) {
            System.out.println();
        }
    }

    public void chooseOption(){

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String option = readLine();

        if (option.equals("1")) {
            play();
        } else if (option.equals("2")) {
            setExit(true);
        }else{
            throw new IllegalArgumentException();
        }
    }



    public String[] StrToStrArr(String str){
        return str.split("");
    }


}
