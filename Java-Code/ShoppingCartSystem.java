/*
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//public class ShoppingCartSystem {
//
//    public static void main(String[] args) {
//        System.out.println("Shopping Cart System Started");
//
//        // Order example
//        Order order = new Order(List.of(
//                new Order.Item("Laptop", 800, 1),
//                new Order.Item("Mouse", 20, 2)
//        ));
//
//        // Process the order
//        order.processOrder();
//
//        // Create GUI to simulate button click for adding item to cart
//        JFrame frame = new JFrame("Shopping Cart");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton addButton = new JButton("Add to Cart");
//
//        // Anonymous Inner Class for button click event handling
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Item added to the cart!");
//            }
//        });
//
//        // Add button to frame
//        frame.add(addButton);
//        frame.setVisible(true);
//    }
//}
//
//// ------------------------------------------------------------
//// Static Nested Class for Utilities
//// ------------------------------------------------------------
//class Utilities {
//    static class TaxCalculator {
//        static double calculateTax(double amount) {
//            return amount * 0.1; // 10% tax
//        }
//    }
//}
//
//// ------------------------------------------------------------
//// Order Class
//// ------------------------------------------------------------
//class Order {
//    private final List<Item> items;
//
//    Order(List<Item> items) {
//        this.items = items;
//    }
//
//    // Method to process the order
//    void processOrder() {
//        double totalCost = 0;
//
//        // Local Inner Class for calculating total cost
//        class CostCalculator {
//            double calculateTotal() {
//                double sum = 0;
//                for (Item item : items) {
//                    double itemCost = item.price * item.quantity;
//                    double tax = Utilities.TaxCalculator.calculateTax(itemCost);
//                    sum += itemCost + tax;
//                }
//                return sum;
//            }
//        }
//
//        // Using the local inner class
//        CostCalculator calculator = new CostCalculator();
//        totalCost = calculator.calculateTotal();
//
//        System.out.printf("Total Cost (including tax): $%.2f%n", totalCost);
//
//        // Anonymous Inner Class to notify the user
//        Runnable notification = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Order processed successfully. Notification sent to the user.");
//            }
//        };
//
//        // Execute notification task
//        notification.run();
//    }
//
//    // ------------------------------------------------------------
//    // Item Class (Inner Class)
//    // ------------------------------------------------------------
//    static class Item {
//        String name;
//        double price;
//        int quantity;
//
//        Item(String name, double price, int quantity) {
//            this.name = name;
//            this.price = price;
//            this.quantity = quantity;
//        }
//    }
//}

import java.util.List;

public class ShoppingCartSystem {

    public static void main(String[] args) {
        System.out.println("Shopping Cart System Started");

        // Order example
        Order order = new Order(List.of(
                new Order.Item("Laptop", 800, 1),
                new Order.Item("Mouse", 20, 2)
        ));

        // Process the order
        order.processOrder();

        // Simulating a button click event using an Anonymous Inner Class
        Runnable notification = new Runnable() {
            @Override
            public void run() {
                System.out.println("Item added to the cart!");
            }
        };

        // Execute notification task
        notification.run();
    }
}

// ------------------------------------------------------------
// Static Nested Class for Utilities
// ------------------------------------------------------------
class Utilities {
    static class TaxCalculator {
        static double calculateTax(double amount) {
            return amount * 0.1; // 10% tax
        }
    }
}

// ------------------------------------------------------------
// Order Class
// ------------------------------------------------------------
class Order {
    private final List<Item> items;

    Order(List<Item> items) {
        this.items = items;
    }

    // Method to process the order
    void processOrder() {
        double totalCost = 0;

        // Local Inner Class for calculating total cost
        class CostCalculator {
            double calculateTotal() {
                double sum = 0;
                for (Item item : items) {
                    double itemCost = item.price * item.quantity;
                    double tax = Utilities.TaxCalculator.calculateTax(itemCost);
                    sum += itemCost + tax;
                }
                return sum;
            }
        }

        // Using the local inner class
        CostCalculator calculator = new CostCalculator();
        totalCost = calculator.calculateTotal();

        System.out.printf("Total Cost (including tax): $%.2f%n", totalCost);

        // Anonymous Inner Class to notify the user
        Runnable notification = new Runnable() {
            @Override
            public void run() {
                System.out.println("Order processed successfully. Notification sent to the user.");
            }
        };

        // Execute notification task
        notification.run();
    }

    // ------------------------------------------------------------
    // Item Class (Inner Class)
    // ------------------------------------------------------------
    static class Item {
        String name;
        double price;
        int quantity;

        Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}

*/

// Main class to simulate button click using an anonymous inner class
public class ShoppingCartSystem {

    public static void main(String[] args) {
        System.out.println("Button Click Example Started");

        // Anonymous Inner Class used to handle button click event
        Button button = new Button();
        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked! Action performed.");
            }
        });

        // Simulate the button click
        button.click();
    }
}

// Interface for the event listener
interface ClickListener {
    void onClick();
}

// Button class with a method to set the click listener
class Button {
    private ClickListener clickListener;

    // Method to set the listener
    void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // Method to simulate the button click
    void click() {
        if (clickListener != null) {
            clickListener.onClick();
        }
    }
}
