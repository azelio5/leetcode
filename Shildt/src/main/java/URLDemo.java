import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/WhatsNew");
        System.out.println("Пpoтoкoл : " + hp.getProtocol());
        System.out.println("Пopт: " + hp.getPort());
        System.out.println("Xocт : " + hp.getHost());
        System.out.println("Фaйл : " + hp.getFile());
        System.out.println("Внешняя форма : " + hp.toExternalForm());
    }

}
