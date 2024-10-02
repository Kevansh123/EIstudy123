// Strategy interface
interface OperationStrategy {
    int performOperation(int num1, int num2);
}

// Concrete strategy for addition
class AdditionStrategy implements OperationStrategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}

// Concrete strategy for subtraction
class SubtractionStrategy implements OperationStrategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}

// Calculator that uses the strategy
class Calculator {
    private OperationStrategy strategy;

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int num1, int num2) {
        return strategy.performOperation(num1, num2);
    }
}
