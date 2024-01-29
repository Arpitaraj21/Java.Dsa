class Bird{
    void eat(){
        System.out.println("eating");
    }
}
class Cow extends Bird{
    void sound(){
        System.out.println("creating noise");
    }
}
class Bull extends Cow{
    void sleep(){
        System.out.println("sleep");
    }

    public static void main(String[] args) {
        Bull myBull = new Bull();
        myBull.sleep();
        myBull.eat();
        myBull.sound();
    }
}