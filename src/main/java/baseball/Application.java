package baseball;

import baseball.controller.Controller;
import baseball.view.InputView;
import baseball.view.InputViewValidation;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        Controller baseballGame = new Controller(new InputView(new InputViewValidation()), new OutputView());
        baseballGame.play();
    }
}
