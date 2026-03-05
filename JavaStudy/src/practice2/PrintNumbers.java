package practice2;

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0)
                System.out.println(i);
            else
                System.out.print(i + " ");
        }
    }
}
