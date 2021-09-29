import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.1);
        Item item2 = new Item("latte", 4.2);
        Item item3 = new Item("drip coffee", 2.05);
        Item item4 = new Item("capuccino", 4.0);
        // item1.name = "mocha";
        // item1.price = 3.1;
        // item2.name = "latte";
        // item2.price = 4.2;
        // item3.name = "drip coffee";
        // item3.price = 2.05;
        // item4.name = "capuccino";
        // item4.price = 4.0;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Chris");
        Order order4 = new Order("Elon");
        // order1.name = "Cindhuri";
        // order2.name = "Jimmy";
        // order3.name = "Noah";
        // order4.name = "Sam";
        order4.addItem(item2);
        order4.addItem(item4);
        System.out.println(order4.getStatusMessage());

        order4.setReady(true);
        System.out.println(order4.getStatusMessage());
        System.out.println(order4.getOrderTotal());
        order4.display();

        // order2.items.add(item1);
        // order2.total += item1.price;

        // order3.items.add(item4);
        // order3.total += item4.price;

        // order4.items.add(item2);
        // order4.total += item2.price;

        // order1.ready = true;
        
        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += item2.price * 2;

        // order2.ready = true;
    
        // // Application Simulations
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
