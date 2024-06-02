
class animal {
    void sleep() {
        System.out.println("sleepings");
    }

    void run() {
        System.out.println("runnings");
    }}

    class Dog extends animal {
        void bark() {
            System.out.println("barking");
        }
    }


public class cccc {
    public static void main(String[] args) {
       animal d1 = new animal();
       d1.run();
       d1.sleep();


       
      Dog a1 = new Dog ();
        a1.bark ();
        a1.run();
        a1.sleep();
    }

}
