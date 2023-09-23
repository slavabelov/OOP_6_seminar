public class Container<T> {
    private T items;

    public Container(T items) {
        this.items = items;
    }

    public T ItemToGet() {
        return item;
    }

    public void ItemToSet(T items) {
        this.items = items;
    }

    public void TypeToPrint() {
        System.out.println("Тип элемента имеет такой вид: " + items.getClass().getName());
    }

    public static void main(String[] args) {
        Container<Int> IntegerContainer = new Container<Integer>(126);
        Container<String> StringContainer = new Container<>("Всем Здравствуйте!");

        IntegerContainer.TypeToPrint(); 
        StringContainer.TypeToPrint(); 
    }
}