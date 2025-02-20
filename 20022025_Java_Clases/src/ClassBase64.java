import java.util.Base64;

public class ClassBase64 {
    public static void main(String[] args) {

        String data = "Muhammat Rizki Saputra";
        String dataEncoded = Base64.getEncoder().encodeToString(data.getBytes());
        byte[] dataDecoded = Base64.getDecoder().decode(dataEncoded);

        System.out.println(dataEncoded);
        System.out.println(new String(dataDecoded));

        String url = "https://kalipare.com/";

        String urlEncoded = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println(urlEncoded);
    }
}
