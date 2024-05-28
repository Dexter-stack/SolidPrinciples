package org.dexter.openclosed;



import java.math.BigDecimal;

public class Main {


// Open/Closed Principle: A software module (like a class or a function) should be open for extension but closed for modification.

    /*
    Example:
Imagine you have a class Shape that has a method to calculate the area.
Initially, you only have Circle and Square classes extending Shape.

If you later want to add a Triangle, according to the open/closed principle,
 you shouldn't change the Shape class. Instead, you simply create a new Triangle class that also extends Shape.
 This way, your original Shape class and its existing subclasses (Circle, Square) remain unchanged and thus stable.
     */
    public static void main(String[] args) {

        Calculator calculator =  new Calculator();
        System.out.println(calculator.calculateNumber(10,20,new AddOperation()));


    }
}
