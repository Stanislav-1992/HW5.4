public class Calculator {

    public static int divide(int a, int b) throws ArithmeticException, MyCustomException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        } if (b == a) {
            throw new MyCustomException("Делить число само на себя нельзя!");
        } else{
            return a / b;
        }
    }
}