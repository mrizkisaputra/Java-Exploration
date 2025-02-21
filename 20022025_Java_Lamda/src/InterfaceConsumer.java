import java.util.function.Consumer;

public class InterfaceConsumer {
    public static void main(String[] args) {

        Consumer<String> consumer = value -> {
            System.out.println(value);
        };

        consumer.accept("kiki");


    }
}
