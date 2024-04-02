import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StringToURI {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("https://google.com");
        list.add("https://linkedin.com");
        list.add("https://yandex.com");

        Stream<URI> stream = list.stream().map(str ->
        {
            try {
                return new URI(str);
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}
