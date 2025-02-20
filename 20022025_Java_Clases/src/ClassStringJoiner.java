import java.util.StringJoiner;

public class ClassStringJoiner {
    public static void main(String[] args) {

        String[] names = {"Muhammat", "Rizki", "Saputra"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }
}
