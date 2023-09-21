import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupNum;
        int tipPercent;
        double totalCost;
        double tipCost;
        String[] itemsOrdered;
        int itemId = 0;



        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        groupNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercent = scan.nextInt();
        scan.nextLine();
        while (itemId != -1) {
            System.out.println("Enter your item ID: ");
            itemId = scan.nextInt();
            if (itemId != -1) {
                //totalCost +=
            }

        }


    }
}