public class GenericExample<T> {
    public void PrintList(List<T> List) {
        for (T items : List) {
            System.out.print(items + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericExample<Int> IntegerPrinter = new GenericExample<>();
        GenericExample<String> StringPrinter = new GenericExample<>();

        List<Int> IntegerList = List.of(80, 150, 764);
        List<String> StringList = List.of("Здравствуй", "Вселенная");

        IntegerPrinter.PrintList(IntegerList);    
        StringPrinter.PrintList(StringList); 
    }
}