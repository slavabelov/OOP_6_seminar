public class ContainerForNumbers <T extends Number> {
    private T numbers;

    public ContainerForNumbers(T numbers) {
        this.numbers = numbers;
    }

    public T NumberToGet() {
        return numbers;
    }

    public void NumberToSet(T numbers) {
        this.numbers = numbers;
    }

    public double SquareCalculation() {
        return numbers.doubleValue() * numbers.doubleValue();
    }

    public static void main(String[] args) {
        ContainerForNumbers<Int> IntegerContainer = new ContainerForNumbers<>(160);
        ContainerForNumbers<Double> DoubleContainer = new ContainerForNumbers<>(174.564);

        System.out.println("Квадрат целого числа имеет вид: " + IntegerContainer.SquareCalculation());
        System.out.println("Квадрат вещественного числа имеет вид: " + DoubleContainer.SquareCalculation());
    }
}