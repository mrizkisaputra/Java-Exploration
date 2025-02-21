import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("muhammat", "rizki", "saputra");

        names.forEach(value -> {
            System.out.println(value);
        });



        setOnClickListener(() -> {

        });

        seyHello("kiki");
        seyHello(null);
    }

    public static void seyHello(String name) {
        var upperName = Optional.ofNullable(name)
                .map(value -> value.toUpperCase())
                .orElse("null");
        System.out.println(upperName);
    }

    public static void setOnClickListener(OnClickListener listener) {
        listener.onClick();
    }
}