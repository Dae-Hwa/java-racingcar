package step3;

import java.util.List;

public class RacingGameResultView {
  private final static String RESULT_BEGIN_MESSAGE = "\n실행결과";
  private final static String SYMBOL_DISTANCE = "-";

  /**
   * 메세지 "실행결과" 출력
   */
  public static void printResultBeginMessage() {
    System.out.println(RESULT_BEGIN_MESSAGE);
  }

  /**
   * 입력 받은 거리에 따라 대쉬(-) 출력
   * 
   * @param distance : int 출력할 거리
   */
  public static void printDistance(int distance) {
    StringBuffer message = new StringBuffer();

    for (int i = 0; i < distance; i++) {
      message.append(SYMBOL_DISTANCE);
    } 

    System.out.println(message.toString());
  }
  
  /**
   * 자동차의    
   * @param racingCarList
   */
  public static void printDistancesOfRacingCarList(List<Car> racingCarList) {
    for (Car racingCar : racingCarList) {
      printDistance(racingCar.getDistance());
    }
    System.out.println();
  }
}