/*
ADVANCED 1 – E-Commerce Order System

Create a class Order:

Attributes:
orderId
customerName
productName
quantity
pricePerItem (PRIVATE)
Requirements:
Initialize using constructor
Use encapsulation properly
Methods:
calculateTotal()
applyDiscount()
Rules:
If total > 5000 → 10% discount
If total > 10000 → 20% discount
Twist:

Final amount must be returned, not printed directly inside constructor.
*/
package day7_prog;

public class Order {

    private String orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private int pricePerItem;

    // Constructor
    Order(String orderId, String customerName, String productName,
          int quantity, int pricePerItem) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    // Calculate total amount
    public double calculateTotal() {
        return quantity * pricePerItem;
    }

    // Apply discount and return final amount
    public double applyDiscount() {

        double total = calculateTotal();

        if (total > 10000) {
            total = total - (total * 0.20);
        }
        else if (total > 5000) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {

        Order obj = new Order(
                "ORD101",
                "Prateek",
                "Laptop",
                2,
                6000
        );

        System.out.println("Order ID : " + obj.getOrderId());
        System.out.println("Customer : " + obj.getCustomerName());
        System.out.println("Product : " + obj.getProductName());

        System.out.println("Total Amount : " + obj.calculateTotal());
        System.out.println("Final Amount After Discount : " + obj.applyDiscount());
    }
}
