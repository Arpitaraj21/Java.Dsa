public class Animal {
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.eat();
        buzo.sleep();
    }
    static void eat(){
        System.out.println("I am eating");
    }
    static void sleep(){
        System.out.println("I am sleepy");
    }
}