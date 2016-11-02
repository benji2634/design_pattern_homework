public class OperationExponent implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    double result = Math.pow(num1, num2);
    return (int) result;
  }
}