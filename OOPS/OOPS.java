import java.util.*;
public class OOPS{
    class Animal{
        public String name;
        eat(){
            System.out.println("yes");
        }
    }
    class Brid extends Animal{
        private fly(){
            System.out.println("yes");
        }
    }
    class Wild extends Animal{
        NonVeg(){
            System.out.println("yes");
        }
    }

    class Peackok extends Brid {
        protected String Nickname;
    }

    class lion extends Wild {
        default king(){
            System.out.println("yes");
        }
        lion(){
            //Default Constructor
        }
        lion(int a ){
           // Parameterized Constructor
        }
        lion( lion l){
            // Copy Constructor
        }
    }
    //A constructor is a special method used to initialize objects.(also allocate memory for object)
    // we use getter and setter to use attribute outside class if attribut is NOT public
    // destructor- Garbage Collector



    abstract class Animal {
    // Abstract method (no body)
    abstract void sound(); //iead

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    // Providing implementation
    void sound() {   //implementation
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // reference of parent, object of child

        a.sound();  // calls Dog's method
        a.sleep();  // calls parent method
    }
}
    public static void main(String[] args) {
    
    }
}