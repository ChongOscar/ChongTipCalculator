import java.util.Arrays;

public class Menu {

    private String[][] menu = {
            {"1", "Crunchy Taco", "2.49"},
            {"2", "Soft Taco", "2.99"},
            {"3", "Beefy Crunch Burrito", "2.49"},
            {"4", "Grilled Cheese Burrito", "4.79"},
            {"5", "Chalupa Supreme", "4.39"},
            {"6", "Cheesy Gordita Crunch", "4.79"},
            {"7", "Large Nacho Fries", "2.99"},
            {"8", "Chicken Quesadilla", "4.99"},
            {"9", "Pepsi", "2.39"},
            {"10", "Baja Blast", "2.39"}
    };

    public double getPrice(String foodId) {
        for (String[] item : menu) {
            if (item[0].equals(foodId)) {
                return Double.parseDouble(item[2]);
            }
        }
        return 0;
    }

    public String getName(String foodId) {
        for (String[] item : menu) {
            if (item[0].equals(foodId)) {
                return item[1];
            }
        }
        return null;
    }

    // _______________________________
    //| 1. Crunchy Taco - 2.49        |
    //|_______________________________|
    public void printMenu() {
        String itemString;
        int stringLength;
        System.out.println(" _________________________________");
        for (String[] item : menu) {
            itemString = "| " + item[0] + ". " + item[1] + " - " + item[2];
            stringLength = itemString.split("").length;
            System.out.print(itemString);
            while (stringLength < 34) {
                System.out.print(" ");
                stringLength++;
            }
            System.out.println("|");
        }
        System.out.println("|_________________________________|");
    }
}
