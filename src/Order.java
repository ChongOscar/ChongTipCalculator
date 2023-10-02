import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private int groupNum;
    private int tipPercent;
    private List<String> itemNameOrdered = new ArrayList<String>();
    private List<String> itemAmountOrdered = new ArrayList<String>();
    private String itemId = "";
    private int numItems;

    public Order(Scanner scan, Menu menu) {

        System.out.println("Welcome to the Taco Bell");
        System.out.print("How many people are in your group: ");
        groupNum = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        tipPercent = scan.nextInt();
        scan.nextLine();
        TipCalculator calculator = new TipCalculator(groupNum, tipPercent);

        while (!itemId.equals("-1")) {
            Main.clearScreen();
            menu.printMenu();
            System.out.println("What would you like to order?");
            System.out.print("Type the food number, -1 to stop: ");
            itemId = scan.nextLine();
            if (!itemId.equals("-1")) {
                System.out.print("How many would you like to order?: ");
                numItems = scan.nextInt();
                scan.nextLine();
                calculator.addMeal(menu.getPrice(itemId) * numItems);
                itemNameOrdered.add(menu.getName(itemId));
                itemAmountOrdered.add(Integer.toString(numItems));
                System.out.print("Added " + numItems + " " + menu.getName(itemId) + " to your cart, press enter to contine");
                scan.nextLine();
            }
        }
        Main.clearScreen();
        System.out.println("Thank you for ordering at Taco Bell, here is your reciept.");
        System.out.println("----------------------------------------------------------");
        System.out.println("Total bill before tip: " + (Math.round(calculator.getTotalBillBeforeTip() * 100.0) / 100.0));
        System.out.println("Total tip percentage: " + (int) calculator.getTipPercentage() + "%");
        System.out.println("Total tip: " + (Math.round(calculator.tipAmount() * 100.0) / 100.0));
        System.out.println("Total bill with tip: " + (Math.round(calculator.totalBill() * 100.0) / 100.0));
        System.out.println("Per person cost before tip: " + (Math.round(calculator.perPersonCostBeforeTip() * 100.0) / 100.0));
        System.out.println("Tip per person: " + (Math.round(calculator.perPersonTipAmount() * 100.0) / 100.0));
        System.out.println("Total cost per person: " + (Math.round(calculator.perPersonTotalCost() * 100.0) / 100.0));
        System.out.println("----------------------------------------------------------");
        System.out.println("Your cart: ");
        for (int i = 0; i < itemNameOrdered.size(); i++) {
            System.out.println(itemAmountOrdered.get(i) + " " + itemNameOrdered.get(i));
        }
    }
}
