package practice4;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("01", "《格林童话》", "佚名", 6.8);
        Book book2 = new Book("02", "《刺客列传》", "佚名", 3.22);

        book1.printInfo();
        book2.printInfo();
    }
}
