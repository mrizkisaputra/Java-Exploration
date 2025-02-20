import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the (A, B, C): ");
        String value = sc.nextLine();

        var data = switch (value) {
            case "A" -> {
                yield "Wow";
            }
            case "B" -> {
                yield "Amazing";
            }
            default -> {
                yield "Not Found";
            }
        };

        System.out.println(data);


    }
}
