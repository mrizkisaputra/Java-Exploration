public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meowww!!!");
    }

    public void eat() {
        System.out.println("Eat fish");
    }
}
