import java.util.ArrayList;
import java.util.List;

public class ExampleForUnboundedWildcard {
    public static void PrintList(List<?> List) {
        for (Object items : List) {
            System.out.print(items + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Int> IntegerList = new ListForArray<>();
        IntegerList.add(100);
        IntegerList.add(570);

        List<String> StringList = new ListForArray<>();
        StringList.add("Здравствуй");
        StringList.add(",Вселенная");

        PrintList(IntegerList);
        PrintList(StringList);
    }
}