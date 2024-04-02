import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, "a=2", "b=3", "c=4", "d==3");

        Map<String, String> result = list2.stream()
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );

        System.out.println(result);
    }
}
