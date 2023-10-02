import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order(scan, menu);

    }
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
           System.out.println(); 
        }
    }
}