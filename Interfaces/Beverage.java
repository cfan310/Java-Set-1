import java.text.DecimalFormat; // Needed for DecimalFormat for price

public interface Beverage { 

    // Shared constant for price format. Available to all classes
    // that implement the Beverage interface.      

    final DecimalFormat PriceFormat = new DecimalFormat("$0.00"); // final = cannot change. it is constant. 
                                                                    // all classes implementing this interface can use this constant 

    //  Common methods (that can be used by any classes that implement the Beverage interface) 
    String getName();  // Coffee, Tea, etc...
    int getSize();     // Size in ounces
    double getPrice(); // Price in dollars  
    

}     

 // the way an object interacts with other objects
 // is referred to as its INTERFACE 
 // A class's pubic and protected methods and attributes
 // define a class's programming interface 
