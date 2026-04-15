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
    public static void main(String[] args) {
    
    }
}