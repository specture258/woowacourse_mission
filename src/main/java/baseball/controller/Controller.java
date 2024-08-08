package baseball.controller;

import baseball.domain.number.AnswerNumber;
import baseball.domain.number.BaseballNumber;
import baseball.domain.validation.Count;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;


public class Controller {

    private final InputView inputView;
    private final OutputView outputView;
    private boolean exit = false;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void play(){
        List<Integer> randomNumber = getRandomNumber();
        flow(randomNumber);
    }

    public void flow(List<Integer> randomNumber){

        while(!exit){
            setExit(false);
            List<Integer> userNumber = getUserNumber();

            Count count = new Count();
            int[] result = count.isSameAnswerNumber(userNumber, randomNumber);
                getBallStrike(result);
            if(result[1] == 3){
                getFinish();
                chooseOption();
            }
        }

    }

    public void chooseOption(){

        String option = inputView.InputCommand();

        if (option.equals("1")) {
            play();
        } else if (option.equals("2")) {
            setExit(true);
        }
    }

    private static List<Integer> getRandomNumber() {
        AnswerNumber answerNumber = new AnswerNumber();
        return answerNumber.createRandomNumber();
    }

    private List<Integer> getUserNumber() {
        outputView.inputNumber();
        String userInputNumber = inputView.InputUserNumber();
        BaseballNumber baseballNumber = new BaseballNumber();
        return baseballNumber.createBaseballNumber(userInputNumber);
    }


    public void getBallStrike(int[] result){
        if(result[0]==0 && result[1]==0){
            System.out.println(outputView.nothingMessage());

        }else{
            System.out.print(outputView.ballMessage(result));
            System.out.println(outputView.strikeMessage(result));
        }
    }

    public void getFinish(){
        System.out.println(outputView.allCorrectMessage());
        System.out.println(outputView.endMessage());
        System.out.println(outputView.restartMessage());
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

}
