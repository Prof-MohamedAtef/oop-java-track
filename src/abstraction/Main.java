package abstraction;

import abstraction.interfaces.AnimalListener;

public class Main {
    public static void main(String[] args) {

        // * solution 1 : extend abstract classes
        /*Animal dog = new Dog();
        dog.eat();
        dog.makeSound();
        dog.see();
        dog.sleep();
        
        Animal cat = new Cat();
        cat.eat();;
        cat.makeSound();
        cat.see();
        cat.sleep();*/

        // * solution 2 : implement interface

        AnimalListener giraphListener = new Girraph();
        giraphListener.eat();
        giraphListener.makeSound();
        
        AnimalListener horseListener = new Horse();
        horseListener.eat();
        horseListener.makeSound();
               
    }
}