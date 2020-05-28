package racinggame.model.domain;

public class Car implements Comparable<Car> {

  private final String name;
  private int distance;
  private final CarMovingStartegy carMovingStartegy;

  public Car(String name, CarMovingStartegy carMovingStartegy) {
    this.name = name;
    this.carMovingStartegy = carMovingStartegy;
  }

  private Car(Car car) {
    this.name = car.name;
    this.distance = car.distance;
    this.carMovingStartegy = car.carMovingStartegy;
  }

  public static Car newInstance(Car car){
    return new Car(car);
  }

  public String getName() {
    return name;
  }

  public int getDistance() {
    return distance;
  }

  /**
   * carMovingStrategy 에 따라 이동여부 판단하여 distance++
   */
  public void move() {
    if (carMovingStartegy.isCanMove()) {
      distance++;
    }
  }

  @Override
  public int compareTo(Car target) {
    return Integer.compare(this.distance, target.distance);
  }
}
