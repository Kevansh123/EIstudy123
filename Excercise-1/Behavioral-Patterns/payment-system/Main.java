public class Main {
    public static void main(String[] args) {
        // Create calculator
        Calculator calculator = new Calculator();

        // Use addition strategy
        calculator.setStrategy(new AdditionStrategy());
        System.out.println("Addition: " + calculator.calculate(5, 3));

        // Use subtraction strategy
        calculator.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: " + calculator.calculate(5, 3));
    }
}
