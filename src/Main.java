public class Main {

    public static void main(String[] args) {

        try {
            int result = Calculator.divide(10, 1);
            System.out.println("Результат: " + result);
        } catch (MyCustomException m) {
            System.out.println("Перехвачено исключение MyCustomException: " + m.getMessage());
        } catch (ArithmeticException a) {
            System.out.println("Перехвачено исключение ArithmeticException: " + a.getMessage());
        } finally {
            System.out.println("Финальный блок выполнен!");
        }
    }
}