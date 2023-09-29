public class Menu {

    String[][] menu = {
            {"1", "Crunchy Taco", "2.49"},
            {"2", "Soft Taco", "2.99"}

    };

    double getPrice(String foodId) {
        for (String[] item : menu) {
            if (item[0].equals(foodId)) {
                return Double.parseDouble(item[2]);
            }
        }
        return 0;
    }
}
