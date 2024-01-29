public class SingleInheritance {
    void eat() {
        System.out.println("i am eating");
    }
}
class Dog extends SingleInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
