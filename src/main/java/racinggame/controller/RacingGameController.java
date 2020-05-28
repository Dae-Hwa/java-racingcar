package racinggame.controller;

import java.util.List;
import racinggame.model.domain.Car;
import racinggame.model.service.RacingGame;
import racinggame.model.service.RacingGameImpl;
import racinggame.view.RacingGameInput;
import racinggame.view.RacingGameResultView;

public class RacingGameController {

  public static void main(String[] args) {
    RacingGame racingGame = new RacingGameImpl(RacingGameInput.getNameOfCarsByScanner(),
        RacingGameInput.getTimeByScanner());

    RacingGameResultView.printResultBeginMessage();

    for (int i = 0; i < racingGame.getTime(); i++) {
      RacingGameResultView.printNameAndDistancesOfRacingCarList(racingGame.play());
    }

    RacingGameResultView.printWinner(racingGame.getWinnerList());
  }
}
