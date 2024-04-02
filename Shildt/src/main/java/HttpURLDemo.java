import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();

        //Отображение метода запроса
        System.out.println("Метод запроса: " + urlCon.getRequestMethod());

        //Отоброжение кода ответа
        System.out.println("Код ответа: " + urlCon.getResponseCode());

        //Отоброжение сообщение ответа
        System.out.println("Сообщение ответа: " + urlCon.getResponseMessage());

        //Получить список полей заголовка и набор его ключей
        Map<String, List<String>> hdrMap = urlCon.getHeaderFields();
        Set<String> hdrFiled = hdrMap.keySet();

        for (String key : hdrFiled) {
            System.out.println("Key " + key + " Value: " + hdrMap.get(key));
        }
    }
}
