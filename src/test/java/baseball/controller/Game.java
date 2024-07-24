package baseball.controller;

import baseball.number.Computer;

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

    public String[] StrToStrArr(String str){
        return str.split("");
    }
}
