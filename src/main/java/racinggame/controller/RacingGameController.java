package racinggame.controller;

import racinggame.model.service.RacingGame;
import racinggame.model.service.RacingGameImpl;
import racinggame.view.RacingGameInput;
import racinggame.view.RacingGameResultView;

public class RacingGameController {

  public static void main(String[] args) {
    RacingGame racingGame = new RacingGameImpl(RacingGameInput.getNameOfCarsByScanner(),
        RacingGameInput.getTimeByScanner());

    RacingGameResultView.printResultBeginMessage();

    while(racingGame.isNotEnd()){
      RacingGameResultView.printNameAndDistancesOfRacingCarList(racingGame.play());
    }

    RacingGameResultView.printWinner(racingGame.getWinnerList());
  }
}
