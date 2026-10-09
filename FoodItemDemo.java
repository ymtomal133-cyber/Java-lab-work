public class FoodItemDemo {
    public static void main(String[] args) {

        // Create the first object
        FoodItem khichuri = new FoodItem();
        khichuri.name = "Khichuri";
        khichuri.price = 90;
        khichuri.quantity = 12;

        // Create the second object
        FoodItem tea = new FoodItem();
        tea.name = "Tea";
        tea.price = 15;
        tea.quantity = 40;

        // Create the third object
        FoodItem samosa = new FoodItem();
        samosa.name = "Samosa";
        samosa.price = 10;
        samosa.quantity = 25;

        // Print the stock report
        khichuri.printLine();
        tea.printLine();
        samosa.printLine();

        // Calculate and print the total stock value
        int total = khichuri.stockValue()
                  + tea.stockValue()
                  + samosa.stockValue();

        System.out.println("Total stock value: Tk " + total);

        // Optional extension: Sell food items
        tea.sell(5);
        samosa.sell(30);

        // Print Tea's updated stock information
        tea.printLine();
    }
}
