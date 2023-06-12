import java.util.ArrayList; 

public class DrinkOrder {

  // ArrayList can hold both Coffee & Tea objects since both implement the 
  // Beverage interface 

  private ArrayList<Beverage> order = new ArrayList<>();  

   // add() method accepts an object any class that implements Beverage interface
  public void add(Beverage beverage) {
    order.add(beverage);        // so we could add coffee or tea, since both of these classes implement the Beverage interface 
  }  

  // Add up total for order
  public double getTotalPrice() {
    double total = 0;
    for(Beverage beverage : order) {
      total += beverage.getPrice(); // add the price of each order in the beverage array list and return (with final/costant formatting) 
    }
    return total;
  } 

  // Return ArrayList of Beverages in order
  public ArrayList<Beverage> getOrder() {
    return order;
  }
 
}