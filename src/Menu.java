import java.util.Arrays;

public class Menu {

    private String[][] menu = {
            {"1", "Crunchy Taco", "2.49"},
            {"2", "Soft Taco", "2.99"}

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
        System.out.println(" _______________________________");
        for (String[] item : menu) {
            itemString = "| " + item[0] + ". " + item[1] + " - " + item[2];
            stringLength = itemString.split("").length;
            System.out.print(itemString);
            while (stringLength < 32) {
                System.out.print(" ");
                stringLength++;
            }
            System.out.println("|");
        }
        System.out.println("|_______________________________|");
    }
}
