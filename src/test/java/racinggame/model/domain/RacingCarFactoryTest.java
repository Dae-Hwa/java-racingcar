package racinggame.model.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingCarFactoryTest {

  @ParameterizedTest
  @ValueSource(strings = {"name1, name2, name3"})
  @DisplayName("자동차 이름 배열의 개수 만큼 인스턴스 생성")
  void createRacingCarList(String carNameInput) {
    String[] carNameArr = carNameInput.split(",");
    List<Car> racingCarList = RacingCarFactory.createRacingCarList(carNameArr);

    for (int i = 0; i < carNameArr.length; i++) {
      assertThat(racingCarList.get(i)).isEqualToComparingFieldByFieldRecursively(
          new Car(carNameArr[i], new RacingCarMovingStrategy()));
    }
  }

  @ParameterizedTest
  @ValueSource(strings = {"name1, name2, name3"})
  @DisplayName("자동차 이름 배열의 개수 만큼 인스턴스 생성")
  void createRacingCarDTOList(String carNameInput) {
    String[] carNameArr = carNameInput.split(",");
    List<Car> racingCarList = RacingCarFactory.createRacingCarList(carNameArr);
    List<CarDTO> racingCarDTOList = RacingCarFactory.createRacingCarDTOList(racingCarList);

    assertThat(racingCarDTOList).isNotEqualTo(racingCarList);

    for (int i = 0; i < carNameArr.length; i++) {
      assertThat(racingCarDTOList.get(i).getName()).isEqualTo(racingCarList.get(i).getName());
      assertThat(racingCarDTOList.get(i).getDistance()).isEqualTo(racingCarList.get(i).getDistance());
    }
  }
}
