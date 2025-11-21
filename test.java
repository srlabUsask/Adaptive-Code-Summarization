public class Test {

    public static void main(String[] args) {
        processOrder();
    }

    public static void processOrder() {
        validateOrder();
        double total = calculateTotal(100.0, 0.1); 
        System.out.println("Final total after calculations: " + total);
    }

    public static void validateOrder() {
        boolean inventoryAvailable = checkInventory("item123", 5);
        boolean customerValid = verifyCustomerDetails("customer456"); 

        if (!inventoryAvailable || !customerValid) {
            System.out.println("Order validation failed.");
            return;
        }
        System.out.println("Order validation successful.");
    }

    public static double calculateTotal(double basePrice, double discountRate) {
        double discountedPrice = applyDiscounts(basePrice, discountRate);
        double totalWithTaxes = calculateTaxes(discountedPrice, 0.07); 
        return totalWithTaxes;
    }

    public static boolean checkInventory(String itemId, int quantity) {
       
        System.out.println("Checking inventory for item: " + itemId + ", quantity: " + quantity);
        return quantity <= 10;
    }

    public static boolean verifyCustomerDetails(String customerId) {

        System.out.println("Verifying details for customer: " + customerId);
        return customerId.startsWith("customer"); 
    }

    public static double applyDiscounts(double basePrice, double discountRate) {
        double discount = basePrice * discountRate;
        double discountedPrice = basePrice - discount;
        System.out.println("Applied discount: " + discount + ", discounted price: " + discountedPrice);
        return discountedPrice;
    }

    public static double calculateTaxes(double price, double taxRate) {
        double tax = price * taxRate;
        double total = price + tax;
        System.out.println("Calculated tax: " + tax + ", total price with tax: " + total);
        return total;
    }
}