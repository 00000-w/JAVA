package practice6;

import practice5.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        ArrayList<practice5.Book> books = new ArrayList<>();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("\n====图书管理系统====");
            System.out.println("1.添加图书");
            System.out.println("2.退出系统");
            System.out.println("3.删除图书（编号)");
            System.out.println("请选择：");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("请输入图书编号：");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("请输入书名：");
                    String name = scanner.nextLine();
                    System.out.println("请输入作者：");
                    String author = scanner.nextLine();
                    System.out.println("请输入价格：");
                    double price = scanner.nextDouble();
                    books.add(new Book(id, name, author, price));
                    System.out.println("添加成功！");
                    break;
                case 2:
                    System.out.println("再见ヾ(•ω•`)o");
                    running = false;
                    break;
                case 3:
                    System.out.println("请输入要删除的图书的编号");
                    int removeId = scanner.nextInt();
                    boolean isBreak = false;
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getId() == removeId) {
                            books.remove(i);
                            isBreak = true;
                            System.out.println("移除成功！");
                        }
                    }
                    if (isBreak) {
                        break;
                    }
                    System.out.println("未找到对应的编号！");
                    break;
                default :
                    System.out.println("无效输入");
            }
        }
        scanner.close();
    }
}
