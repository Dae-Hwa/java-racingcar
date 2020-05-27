package racing_game.model;

import java.util.List;

public interface RacingGame {
  /**
   * 지정된 횟수만큼 게임 진행
   * 
   * racingCarList에 있는 racingCar들을 임의로 이동시킨다.
   * 
   * @return racingCarList 반환
   */
  List<Car> play();

  /**
   * 자동차 경주의 우승자 반환<br/>
   * 
   * 반환 시점에 가장 멀리간 자동차를 출력한다.
   */
  List<Car> getWinnerList();

  /**
   * 게임의 반복 횟수를 반환
   * 
   * @return int, 게임 반복 횟수
   */
  int getTime();
}
