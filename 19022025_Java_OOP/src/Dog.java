public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("AUuuuu!!!");
    }

    public int speed() {
        return 7;
    }
}
