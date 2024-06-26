package abstraction;

import abstraction.interfaces.AnimalListener;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    
    // Abstract method (does not have a body)
    public abstract void see();

   
    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    // Regular method
    public void eat() {
        System.out.println("This animal is eating.");
    }
}
/*
 * solution 1 : extend abstract classes
 * solution 2 : implement interface
 */
/*
  * solution 1 : extend abstract classes
 */
 /* 
 class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }

    @Override
    public void see() {
        System.out.println("Watching ...");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("The cat says: Meow Meow");
    }

    @Override
    public void see() {
        System.out.println("Watching ...");
    }

}*/

/*
 * solution 2 : implement interface
 */
class Girraph implements AnimalListener{

    @Override
    public void makeSound() {
        System.out.println("The Giraph says: Sound of Giraph");
    }

    @Override
    public void eat() {
        System.out.println("The Giraph is Eating ...");
    }
}

class Horse implements AnimalListener{

    @Override
    public void makeSound() {
        System.out.println("The Horse says: Sound of Horse");
    }

    @Override
    public void eat() {
        System.out.println("The Horse is Eating ...");
    }

}