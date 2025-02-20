import java.util.UUID;

public class ClassUUID {
    public static void main(String[] args) {

        for (var i = 1; i <= 10; i++) {
            var pin = UUID.randomUUID().toString();
            System.out.println(pin);
        }

    }
}
