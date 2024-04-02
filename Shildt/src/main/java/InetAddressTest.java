import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.google.com");
        System.out.println(address);
        System.out.println();
        InetAddress[] sw = InetAddress.getAllByName("www.google.com");
        for (InetAddress adr : sw) {
            System.out.println(adr);
        }


    }
}
