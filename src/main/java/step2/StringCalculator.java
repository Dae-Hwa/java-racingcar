package step2;

public class StringCalculator {

    /**
     * left와 right를 더해준다.
     * 
     * @param left  : double, 더할 값
     * @param right : double, 더할 값
     * @return String, 더한 값을 반환
     */
    public String plus(double left, double right) {
        return String.valueOf(left + right);
    }

    /**
     * left에서 right를 뺀다.
     * 
     * @param left  : double, 뺄셈 대상
     * @param right : double, left에서 빼줄 값
     * @return String, left에서 right를 뺀 값을 반환
     */
    public String minus(double left, double right) {
        return String.valueOf(left - right);
    }

    /**
     * left와 right를 곱한다.
     * 
     * @param left  : double, 곱할 값
     * @param right : double, 곱할 값
     * @return String, 곱한 값을 반환
     */
    public String multiply(double left, double right) {
        return String.valueOf(left * right);
    }
    
    /**
     * left에서 right를 나눈다.
     * 
     * @param left  : double, 나눌 대상
     * @param right : double, 나눌 값
     * @return String, 나눈 값을 반환
     */
    public String division(double left, double right) {
        return String.valueOf(left/right);
    }

}
