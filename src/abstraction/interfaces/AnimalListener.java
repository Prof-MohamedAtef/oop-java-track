package abstraction.interfaces;

import java.util.Locale.Category;

/*
 * An interface is defined using the interface keyword.
 * Interfaces can contain abstract methods, 
 *  default methods,
 *  static methods,
 *  and constants.
 */

public interface AnimalListener {
    //constant
    String CATEGORY = "Girraph";

    //Abstract method
    void makeSound();
    void eat();    

    // Default method
    default void sleep(){
        System.out.println("This animal is sleeping");
    }

    // Static method (Java 8+)
    public static void printAnimal(){
        System.out.println("Animal: " + CATEGORY);
    }

    // private method (JAva 9+)
    private void privateMethod(){
        System.out.println("This is a private method in the interface.");
    }

    // Default method using private method (Java 9+)
    default void showPrivate(){
        privateMethod();
    }
}